/**
 * 
 */
package com.gzwl.demo.service.sys.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gzwl.demo.dao.RoleMapper;
import com.gzwl.demo.dao.RoleMenuMapper;
import com.gzwl.demo.pojo.Menu;
import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleExample;
import com.gzwl.demo.pojo.RoleMenuKey;
import com.gzwl.demo.service.sys.RoleService;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * <p>
 * Title: LwRolesServiceImpl
 * </p>
 * 
 * <p>
 * Description:超级管理员角色不允许查询修改删除
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class RoleServiceImpl implements RoleService {
	@Resource
	private RoleMapper roleMapper;
	@Resource
	private RoleMenuMapper roleMenuMapper;

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int deleteByPrimaryKey(Long roleId) {
		if (roleId == 1L) {
			return 0;
		}
		Role roles = roleMapper.selectByPrimaryKey(roleId);
		if (roles == null) {
			return 0;
		}
		List<RoleMenuKey> rolesMenusKeys = adapterRolesMenusKeys(roleId);
		if (!rolesMenusKeys.isEmpty()) {
			roleMenuMapper.deleteBatchByPrimaryKey(rolesMenusKeys);
		}
		return roleMapper.deleteByPrimaryKey(roleId);
	}

	private int insertSelective(Role record) {
		int i = roleMapper.insertSelective(record);
		List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
		for (Menu menu : record.getMenuList()) {
			list.add(new RoleMenuKey(record.getRoleId(), menu.getMenuId()));
		}
		roleMenuMapper.insertBatch(list);
		return i;
	}

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int saveOrUpdate(Role role) {
		if (role.getRoleId() == null) {
			return insertSelective(role);
		} else {
			List<RoleMenuKey> rolesMenusKeys = adapterRolesMenusKeys(role.getRoleId());
			if (!rolesMenusKeys.isEmpty()) {
				roleMenuMapper.deleteBatchByPrimaryKey(rolesMenusKeys);
			}
			List<Menu> menuList = role.getMenuList();
			if (!menuList.isEmpty()) {
				List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
				for (Menu menu : menuList) {
					list.add(new RoleMenuKey(role.getRoleId(), menu.getMenuId()));
				}
				roleMenuMapper.insertBatch(list);
			}
			return roleMapper.updateByPrimaryKeySelective(role);
		}
	}

	@Override
	public ResultUtil listByExample(Integer pageIndex, Integer pageSize, Role record) {
		PageHelper.startPage(pageIndex, pageSize);
		RoleExample example = new RoleExample();
		RoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdNotEqualTo(1L);
		List<Role> list = roleMapper.selectByExample(example);
		PageInfo<Role> pageInfo = new PageInfo<Role>(list);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public List<Role> list() {
		RoleExample example = new RoleExample();
		RoleExample.Criteria criteria = example.createCriteria();
		criteria.andRoleIdNotEqualTo(1L);
		return roleMapper.selectByExample(example);
	}

	private List<RoleMenuKey> adapterRolesMenusKeys(Long roleId) {
		List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
		Role roles = roleMenuMapper.selectByExample(roleId);
		if (roles != null) {
			List<Menu> menuList = roles.getMenuList();
			for (Menu menu : menuList) {
				list.add(new RoleMenuKey(roleId, menu.getMenuId()));
			}
		}
		return list;
	}

}
