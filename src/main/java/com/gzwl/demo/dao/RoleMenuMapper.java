package com.gzwl.demo.dao;

import java.util.List;

import com.gzwl.demo.pojo.Menu;
import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleMenuKey;

public interface RoleMenuMapper {

	int deleteByPrimaryKey(RoleMenuKey key);

	int insert(RoleMenuKey record);

	/** 角色一对多菜单 */
	Role selectByExample(Long roleId);
	
	int insertBatch(List<RoleMenuKey> roleMenuKeyList);
	
	int deleteBatchByPrimaryKey(List<RoleMenuKey> roleMenuKeyList);
	
	/** 菜单一对多角色 */
	Menu selectByMenuId(Long menuId);

}