package com.gzwl.demo.shiro;

import javax.annotation.Resource;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.stereotype.Component;

import com.gzwl.demo.pojo.Employee;
import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleMenuKey;
import com.gzwl.demo.service.personnel.EmployeeService;
import com.gzwl.demo.service.sys.RoleMenuService;

@Component
public class CustomRealm extends AuthorizingRealm {
	@Resource
	private EmployeeService employeeService;
	@Resource
	private RoleMenuService roleMenuService;

	@Override
	public String getName() {
		return "CustomRealm";
	}

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
		Employee admin = (Employee) principalCollection.getPrimaryPrincipal();
		RoleMenuKey record = new RoleMenuKey();
		record.setRole(new Role(admin.getRoleId().longValue()));
		Role roles = roleMenuService.getRole(record);
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.setStringPermissions(roles.getPermsSet());
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String username = (String) token.getPrincipal();
		String password = new String((char[]) token.getCredentials());
		/** 查询用户信息 */
		Employee employee = employeeService.getEmployeeByWhere(new Employee(username));
		/** 账号不存在 */

		if (employee == null) {
			throw new UnknownAccountException("账号不存在!");
		}
		/** 密码错误 */
		if (!password.equals(employee.getEmployeeLoginPassword())) {
			throw new IncorrectCredentialsException("账号或密码不正确!");
		}

		/** 账号未启用 */
		if (!employee.getEmployeeStatus()) {
			throw new LockedAccountException("账号未激活");
		}

		/** 账号未分配角色 */
		if (employee.getRoleId() == null || employee.getRoleId() == 0) {
			throw new UnknownAccountException("账号未分配角色!");
		}
		password = new Md5Hash(password).toString();
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(employee, password, getName());
		return info;
	}

}
