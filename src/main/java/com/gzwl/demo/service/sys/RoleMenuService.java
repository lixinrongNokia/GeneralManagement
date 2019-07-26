package com.gzwl.demo.service.sys;

import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleMenuKey;

/**
 * 
 * 
 * <p>
 * Title: RoleMenuService
 * </p>
 * 
 * <p>
 * Description: 角色连接菜单中间表
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 */
public interface RoleMenuService {

	/**
	 * 带树状结构菜单
	 * 
	 * @param record
	 * @return
	 */
	Role getRole(RoleMenuKey record);

	/**
	 * 带非树状结构菜单
	 * 
	 * @param record
	 * @return
	 */
	Role getRoleNoTree(RoleMenuKey record);

}