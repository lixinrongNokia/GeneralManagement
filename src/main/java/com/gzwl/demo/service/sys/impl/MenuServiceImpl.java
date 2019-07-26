/**
 * 
 */
package com.gzwl.demo.service.sys.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.gzwl.demo.dao.MenuMapper;
import com.gzwl.demo.dao.RoleMenuMapper;
import com.gzwl.demo.pojo.Menu;
import com.gzwl.demo.pojo.MenuExample;
import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.pojo.RoleMenuKey;
import com.gzwl.demo.service.sys.MenuService;
import com.gzwl.demo.util.MenuAdapterUtil;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * <p>
 * Title: LwMenusServiceImpl
 * </p>
 * 
 * <p>
 * Description:菜单接口实现
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class MenuServiceImpl implements MenuService {
	@Resource
	private MenuMapper menuMapper;
	@Resource
	private RoleMenuMapper roleMenuMapper;

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int deleteByPrimaryKey(Long menuId) {
		Menu menu = getByPrimaryKey(menuId);
		if (menu == null) {
			return 0;
		}
		MenuExample example = new MenuExample();
		MenuExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(menuId);
		int count = menuMapper.countByExample(example);
		if (count > 0) {
			return 0;
		}
		Menu oldMenu = roleMenuMapper.selectByMenuId(menuId);
		if (oldMenu != null) {
			List<RoleMenuKey> list = new ArrayList<RoleMenuKey>();
			for (Role role : oldMenu.getRoleList()) {
				list.add(new RoleMenuKey(role.getRoleId(), oldMenu.getMenuId()));
			}
			if (!list.isEmpty()) {
				roleMenuMapper.deleteBatchByPrimaryKey(list);
			}
		}
		return menuMapper.deleteByPrimaryKey(menu.getMenuId());
	}

	@Override
	public ResultUtil listByExample(Menu record) {
		MenuExample example = new MenuExample();
		List<Menu> list = menuMapper.selectByExample(example);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount((long)list.size());
		resultUtil.setData(list);
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public List<Menu> listMenu() {
		return MenuAdapterUtil.adapterMenuList(menuMapper.selectByExample(new MenuExample()));
	}

	@Override
	public Menu getByPrimaryKey(Long menuId) {
		return menuMapper.customizationSelectByPrimaryKey(menuId);
	}

	@Override
	public int saveOrUpdate(Menu menu) {
		if (menu.getMenuId() == null) {
			menu.setSpread("false");
			return menuMapper.insertSelective(menu);
		} else {
			return menuMapper.updateByPrimaryKeySelective(menu);
		}
	}

}
