package com.gzwl.demo.service.personnel;

import java.util.List;

import com.gzwl.demo.pojo.Department;
import com.gzwl.demo.search.personnel.DepartmentFormBean;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * @ClassName: DepartmentService
 * @Desc: 部门业务接口
 * @author: lxr
 * @date: 2019年6月17日 上午10:30:29
 * @version 1.0
 */
public interface DepartmentService {
	/**
	 * 
	 * @Title: deleteByPrimaryKey 
	 * @Desc: 删除部门 
	 * @param departmentId
	 * @return
	 */
	int deleteByPrimaryKey(Integer departmentId);
	/**
	 * 
	 * @Title: listDepartment 
	 * @Desc: 部门列表 
	 * @return
	 */
	ResultUtil listDepartment(DepartmentFormBean departmentFormBean);
	/**
	 * 
	 * @Title: listDepartmentNonSort 
	 * @Desc: 部门列表无分页 
	 * @return
	 */
	List<Department> listDepartmentNonSort();
	/**
	 * 
	 * @Title: updateById 
	 * @Desc: 新增或更新部门 
	 * @param department
	 * @return
	 */
	int saveOrUpdate(Department department);
	/**
	 * 
	 * @Title: getDepartmentById 
	 * @Desc: 获取 
	 * @param departmentId
	 * @return
	 */
	Department getDepartmentById(Integer departmentId);
}
