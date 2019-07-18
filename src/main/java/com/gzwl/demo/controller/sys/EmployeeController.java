/**
 * 
 */
package com.gzwl.demo.controller.sys;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.LockedAccountException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.gzwl.demo.pojo.Employee;
import com.gzwl.demo.service.personnel.EmployeeService;
import com.gzwl.demo.util.ResultBean;

/**
 * 
 * <p>
 * Title: UserController
 * </p>
 * 
 * <p>
 * Description:管理员管理
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月28日
 * 
 */
@Controller
@RequestMapping("/user")
public class EmployeeController {
	@Resource
	private EmployeeService employeeService;

	/**
	 * 
	 * 
	 * <p>
	 * Title: login
	 * </p>
	 * 
	 * <p>
	 * Description:跳转用户登录页面
	 * </p>
	 * 
	 * @return
	 */
	@RequestMapping("/login")
	public String login() {
		Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
		if (employee != null) {
			return "redirect:/sys/home";
		}
		return "login";
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: checklogin
	 * </p>
	 * 
	 * <p>
	 * Description:用户登录
	 * </p>
	 * 
	 * @param req
	 * @param res
	 * @param username
	 * @param password
	 * @param remember
	 * @return
	 */
	@RequestMapping("/checklogin")
	@ResponseBody
	public ResultBean checklogin(HttpServletRequest req, HttpServletResponse res, String username, String password) {
		if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
			return new ResultBean(false, "参数不能为空");
		}
		try {
			Subject subject = SecurityUtils.getSubject();
			UsernamePasswordToken token = new UsernamePasswordToken(username, password, false);
			subject.login(token);
		} catch (UnknownAccountException e) {
			return new ResultBean(false, e.getMessage());
		} catch (IncorrectCredentialsException e) {
			return new ResultBean(false, e.getMessage());
		} catch (LockedAccountException e) {
			return new ResultBean(false, e.getMessage());
		} catch (AuthenticationException e) {
			return new ResultBean(false, "账户验证失败");
		}
		return new ResultBean(true, true, 0);
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: personalDataView
	 * </p>
	 * 
	 * <p>
	 * Description:跳转显示用户信息页面
	 * </p>
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping("/personalDataView")
	public String personalDataView(HttpServletRequest req) {
		Employee employee = (Employee) SecurityUtils.getSubject().getPrincipal();
		if (employee == null) {
			return "error";
		}
		req.setAttribute("employee", employee);
		return "sys/user/info";
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: personalData
	 * </p>
	 * 
	 * <p>
	 * Description:修改用户信息
	 * </p>
	 * 
	 * @param req
	 * @param lwAdmin
	 * @return
	 */
	@RequestMapping("/personalData")
	@ResponseBody
	public ResultBean personalData(HttpServletRequest req, @RequestBody Employee employee) {
		int i = employeeService.saveOrUpdate(employee);
		if (i > 0) {
			return new ResultBean(true, true);
		}
		return new ResultBean(false);
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: changePwdView
	 * </p>
	 * 
	 * <p>
	 * Description:跳转修改用户密码页面
	 * </p>
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping("/changePwdView")
	public String changePwdView(HttpServletRequest req) {
		return "sys/user/password";
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: changePwd
	 * </p>
	 * 
	 * <p>
	 * Description:修改用户密码
	 * </p>
	 * 
	 * @param req
	 * @param oldPassWord
	 * @param newPassWord
	 * @return
	 */
	@RequestMapping("/changePwd")
	@ResponseBody
	public ResultBean changePwd(HttpServletRequest req, String oldPassWord, String newPassWord) {
		if (oldPassWord == null || oldPassWord.trim().isEmpty() || newPassWord == null
				|| newPassWord.trim().isEmpty()) {
			return new ResultBean(false);
		} else {
			Employee admin = (Employee) SecurityUtils.getSubject().getPrincipal();
			if (oldPassWord.equals(admin.getEmployeeLoginPassword())) {
				admin.setEmployeeLoginPassword(newPassWord);
				int i = employeeService.saveOrUpdate(admin);
				if (i > 0) {
					return new ResultBean(true, true);
				}
			}
			return new ResultBean(false);
		}
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: forgetView
	 * </p>
	 * 
	 * <p>
	 * Description:跳转用户找回密码页面
	 * </p>
	 * 
	 * @param req
	 * @return
	 */
	@RequestMapping("/forgetView")
	public String forgetView(HttpServletRequest req) {
		return "sys/user/forget";
	}

	/**
	 * 
	 * 
	 * <p>
	 * Title: sessionOut
	 * </p>
	 * 
	 * <p>
	 * Description:seesion超时跳转页面
	 * </p>
	 * 
	 * @return
	 */
	@RequestMapping("/sessionOut")
	public String sessionOut() {
		return "common/sessionOut";
	}
}
