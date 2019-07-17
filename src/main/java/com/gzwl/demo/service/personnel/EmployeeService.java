package com.gzwl.demo.service.personnel;

import com.gzwl.demo.pojo.Employee;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * 
 * <p>
 * Title: EmployeeService
 * </p>
 * 
 * <p>
 * Description: 员工业务
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年4月4日
 */
public interface EmployeeService {

	/**
	 * 
	 * 
	 * <p>
	 * Title: deleteByPrimaryKey
	 * </p>
	 * 
	 * <p>
	 * Description:按主键删除单个
	 * </p>
	 * 
	 * @param adminId
	 * @return
	 */
	int deleteByPrimaryKey(Integer EmployeeId);

	/**
	 * 
	 * 
	 * <p>
	 * Title: listOrByWhere
	 * </p>
	 * 
	 * <p>
	 * Description:分页获取列表
	 * </p>
	 * 
	 * @param pageIndex
	 * @param pageSize
	 * @param record
	 * @return
	 */
	ResultUtil listOrByWhere(Integer pageIndex, Integer pageSize, Employee employee);

	/**
	 * 
	 * 
	 * <p>
	 * Title: getEmployeeByPrimaryKey
	 * </p>
	 * 
	 * <p>
	 * Description:按主键获取单个
	 * </p>
	 * 
	 * @param adminId
	 * @return
	 */
	Employee getEmployeeByPrimaryKey(Integer EmployeeId);

	/**
	 * 
	 * 
	 * <p>
	 * Title: getEmployeeByWhere
	 * </p>
	 * 
	 * <p>
	 * Description:按唯一条件获取单个
	 * </p>
	 * 
	 * @param record
	 * @return
	 */
	Employee getEmployeeByWhere(Employee employee);

	/**
	 * 
	 * 
	 * <p>
	 * Title: saveOrUpdate
	 * </p>
	 * 
	 * <p>
	 * Description:新增或更新
	 * </p>
	 * 
	 * @param admin
	 * @param fkId
	 * @param skId
	 * @return
	 */
	int saveOrUpdate(Employee employee);

}