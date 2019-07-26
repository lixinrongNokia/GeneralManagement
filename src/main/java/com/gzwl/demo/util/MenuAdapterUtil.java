package com.gzwl.demo.util;

import java.util.ArrayList;
import java.util.List;

import com.gzwl.demo.pojo.Menu;

/**
 * 
 * <p>
 * Title: MenuAdapterUtil
 * </p>
 * 
 * <p>
 * Description:菜单适配器
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年4月11日
 * 
 */
public final class MenuAdapterUtil {
	public static List<Menu> adapterMenuList(List<Menu> list) {
		List<Menu> groupMenu = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getParentId() == 0) {
				Menu menu = new Menu();
				menu = list.get(i);
				groupMenu.add(adapterMenu(list, menu));
			}

		}
		return groupMenu;
	}

	public static Menu adapterMenu(List<Menu> list, Menu menu) {
		for (int j = 0; j < list.size(); j++) {
			if (list.get(j).getParentId() == menu.getMenuId()) {
				Menu menu2 = new Menu();
				menu2 = list.get(j);
				menu.getChildren().add(menu2);
				adapterMenu(list, menu2);
			}
		}
		return menu;
	}
}