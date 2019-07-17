package com.gzwl.demo.pojo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Menu implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -4909449560435903870L;

	/** 菜单ID*/
    private Long menuId;

    /** 菜单名*/
    private String title;

    /** 图标*/
    private String icon;

    /** 资源地址*/
    private String href;

    /** 权限*/
    private String perms;

    /** true：展开，false：不展开*/
    private String spread;

    /** 父节点*/
    private Long parentId;

    /** 加盐*/
    private Long sorting;
    /**父菜单*/
    private Menu parentMenu;
    
    private List<Menu> children = new ArrayList<>(100);

	private List<Role> roleList = new ArrayList<Role>(10);

	public Menu() {
	}

	public Menu(Long menuId) {
		setMenuId(menuId);
	}

    public Long getMenuId() {
        return menuId;
    }

    public void setMenuId(Long menuId) {
        this.menuId = (menuId == null || menuId == 0) ? null : menuId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon == null ? null : icon.trim();
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }

    public String getPerms() {
        return perms;
    }

    public void setPerms(String perms) {
        this.perms = perms == null ? null : perms.trim();
    }

    public String getSpread() {
        return spread;
    }

    public void setSpread(String spread) {
        this.spread = spread == null ? null : spread.trim();
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getSorting() {
        return sorting;
    }

    public void setSorting(Long sorting) {
        this.sorting = sorting;
    }
    public Menu getParentMenu() {
		return parentMenu;
	}

	public void setParentMenu(Menu parentMenu) {
		this.parentMenu = parentMenu;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof Menu)) {
			return false;
		}
		Menu castOther = (Menu) other;

		return ((this.getMenuId() == castOther.getMenuId()) || (this.getMenuId() != null
				&& castOther.getMenuId() != null && this.getMenuId().equals(castOther.getMenuId())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + (getMenuId() == null ? 0 : this.getMenuId().hashCode());
		return result;
	}
}