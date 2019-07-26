package com.gzwl.demo.pojo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Role implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 365472876529679592L;

	/** 角色编号 */
	private Long roleId;

	/** 角色名 */
	private String roleName;

	/** */
	private String roleRemark;

	/** 角色对应的菜单 */
	private List<Menu> menuList = new ArrayList<>(10);
	/** 角色对应的权限 */
	private Set<String> permsSet = new HashSet<>(16);

	private List<Employee> employeeList = new ArrayList<Employee>(10);

	private List<Long> menuIdList = new ArrayList<>(10);

	public Role() {
	}

	public Role(Long roleId) {
		this.roleId = roleId;
	}

	public Long getRoleId() {
		return roleId;
	}

	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName == null ? null : roleName.trim();
	}

	public String getRoleRemark() {
		return roleRemark;
	}

	public void setRoleRemark(String roleRemark) {
		this.roleRemark = roleRemark == null ? null : roleRemark.trim();
	}

	public List<Menu> getMenuList() {
		return menuList;
	}

	public void setMenuList(List<Menu> menuList) {
		this.menuList = menuList;
	}

	public Set<String> getPermsSet() {
		return permsSet;
	}

	public void setPermsSet(Set<String> permsSet) {
		this.permsSet = permsSet;
	}

	public List<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(List<Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public List<Long> getMenuIdList() {
		for (Menu menu : menuList) {
			menuIdList.add(menu.getMenuId());
		}
		return menuIdList;
	}

	public void setMenuIdList(List<Long> menuIdList) {
		this.menuIdList = menuIdList;
	}
}