package com.gzwl.demo.service.sys;

import java.util.List;

import com.gzwl.demo.pojo.Menu;
import com.gzwl.demo.util.ResultUtil;

/**
 * 

* <p>Title: MenuService</p>  

* <p>Description:菜单接口 </p>  

* @author lixinrong 

* @date 2019年3月29
 */
public interface MenuService {

	/**
	 * 
	
	 * <p>Title: deleteByPrimaryKey</p>  
	
	 * <p>Description:按主键删除 </p>  
	
	 * @param menuId
	 * @return
	 */
	int deleteByPrimaryKey(Long menuId);

	/**
	 * 
	
	 * <p>Title: listByExample</p>  
	
	 * <p>Description:获取全部菜单 </p>  
	
	 * @param page
	 * @param limit
	 * @param record
	 * @return
	 */
	ResultUtil listByExample(Menu menu);
	/**
	 * 查询需要权限的菜单
	 * @return List
	 */
	List<Menu> listMenu();

	/**
	 * 
	
	 * <p>Title: getByPrimaryKey</p>  
	
	 * <p>Description:按主键获取单个菜单 </p>  
	
	 * @param menuId
	 * @return
	 */
	Menu getByPrimaryKey(Long menuId);

	/**
	 * 
	
	 * <p>Title: saveOrUpdate</p>  
	
	 * <p>Description:新建或更新菜单 </p>  
	
	 * @param menu
	 * @return
	 */
	int saveOrUpdate(Menu menu);

}