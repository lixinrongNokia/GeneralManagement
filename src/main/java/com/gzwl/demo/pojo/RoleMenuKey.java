package com.gzwl.demo.pojo;

import java.util.Objects;

public class RoleMenuKey {
	private Role role;
	private Menu menu;

	public RoleMenuKey() {
	}

	public RoleMenuKey(Long roleId) {
		this.role = new Role(roleId);
	}

	public RoleMenuKey(Long roleId, Long menuId) {
		this.role = new Role(roleId);
		this.menu = new Menu(menuId);
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Menu getMenu() {
		return menu;
	}

	public void setMenu(Menu menu) {
		this.menu = menu;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof RoleMenuKey)) {
			return false;
		}
		RoleMenuKey castOther = (RoleMenuKey) other;

		return ((Objects.equals(this.menu.getMenuId(), castOther.menu.getMenuId())) || (this.menu.getMenuId() != null
				&& castOther.menu.getMenuId() != null && this.menu.getMenuId().equals(castOther.menu.getMenuId())))
				&& ((Objects.equals(this.role.getRoleId(), castOther.role.getRoleId()))
						|| (this.role.getRoleId() != null && castOther.role.getRoleId() != null
								&& this.role.getRoleId().equals(castOther.role.getRoleId())));
	}

	@Override
	public int hashCode() {
		int result = 17;
		result = 37 * result + (this.menu.getMenuId() == null ? 0 : this.menu.getMenuId().hashCode());
		result = 37 * result + (this.role.getRoleId() == null ? 0 : this.role.getRoleId().hashCode());
		return result;
	}
}