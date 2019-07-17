package com.gzwl.demo.service.sys;

import java.util.List;

import com.gzwl.demo.pojo.Role;
import com.gzwl.demo.util.ResultUtil;

/**
 * 

* <p>Title: RoleService</p>  

* <p>Description:角色接口 </p>  

* @author lixinrong 

* @date 2019年4月3日
 */
public interface RoleService {

	/**
	 * 
	
	 * <p>Title: deleteByPrimaryKey</p>  
	
	 * <p>Description:按主键删除 </p>  
	
	 * @param roleId
	 * @return
	 */
    int deleteByPrimaryKey(Long roleId);

    /**
     * 
    
     * <p>Title: listByExample</p>  
    
     * <p>Description:分页获取列表 </p>  
    
     * @param pageIndex
     * @param pageSize
     * @param record
     * @return
     */
    ResultUtil listByExample(Integer pageIndex, Integer pageSize,Role role);
    
    /**
     * 
    
     * <p>Title: list</p>  
    
     * <p>Description:获取全部角色 </p>  
    
     * @return
     */
    List<Role> list();

    /**
     * 
    
     * <p>Title: saveOrUpdate</p>  
    
     * <p>Description:更新单个 </p>  
    
     * @param role
     * @return
     */
    int saveOrUpdate(Role role);
    
}