/**
 * 
 */
package com.gzwl.demo.service.sys.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.gzwl.demo.dao.MenuMapper;
import com.gzwl.demo.dao.RoleMapper;
import com.gzwl.demo.dao.RoleMenuMapper;
import com.gzwl.demo.pojo.Menu;
import com.gzwl.demo.pojo.MenuExample;
import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleMenuKey;
import com.gzwl.demo.service.sys.RoleMenuService;
import com.gzwl.demo.util.MenuAdapterUtil;

/**
 * 
 * <p>
 * Title: LwRolesMenusServiceImpl
 * </p>
 * 
 * <p>
 * Description:
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class RoleMenuServiceImpl implements RoleMenuService {
	@Resource
	private RoleMenuMapper roleMenuMapper;
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private MenuMapper menuMapper;

	@Override
	public Role getRoleNoTree(RoleMenuKey record) {
		return roleMenuMapper.selectByExample(record.getRole().getRoleId());
	}

	@Override
	public Role getRole(RoleMenuKey record) {
		Role roles = null;
		if (record.getRole().getRoleId() == 1L) {
			// 超级管理拥有所有权限
			roles = roleMapper.selectByPrimaryKey(record.getRole().getRoleId());
			List<Menu> list = menuMapper.selectByExample(new MenuExample());
			roles.setMenuList(list);
		} else {
			roles = roleMenuMapper.selectByExample(record.getRole().getRoleId());
		}
		List<Menu> list = roles.getMenuList();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getPerms() != null && !"".equals(list.get(i).getPerms())) {
				roles.getPermsSet().add(list.get(i).getPerms());
			}
		}
		roles.setMenuList(MenuAdapterUtil.adapterMenuList(list));
		return roles;
	}

}
