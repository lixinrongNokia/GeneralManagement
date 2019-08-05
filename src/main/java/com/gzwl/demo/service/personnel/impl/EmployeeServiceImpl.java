/**
 * 
 */
package com.gzwl.demo.service.personnel.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gzwl.demo.dao.EmployeeInfoMapper;
import com.gzwl.demo.dao.EmployeeMapper;
import com.gzwl.demo.pojo.Employee;
import com.gzwl.demo.pojo.EmployeeExample;
import com.gzwl.demo.pojo.EmployeeInfo;
import com.gzwl.demo.service.personnel.EmployeeService;
import com.gzwl.demo.util.MyUtils;
import com.gzwl.demo.util.ResultUtil;
/**
 * 
 * <p>
 * Title: EmployeeServiceImpl
 * </p>
 * 
 * <p>
 * Description:超级管理员不允许查询修改删除
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月29日
 * 
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Resource
	private EmployeeMapper employeeMapper;
	@Resource
	private EmployeeInfoMapper employeeInfoMapper;

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int deleteByPrimaryKey(Integer employeeId) {
		if (employeeId == 1) {
			return 0;
		}
		Employee employee = getEmployeeByPrimaryKey(employeeId);
		if (employee == null) {
			return 0;
		}
		employeeInfoMapper.deleteByPrimaryKey(employeeId);
		return employeeMapper.deleteByPrimaryKey(employeeId);
	}

	@Override
	public ResultUtil listOrByWhere(Integer pageIndex, Integer pageSize, Employee employee) {
		PageHelper.startPage(pageIndex, pageSize);
		EmployeeExample example = new EmployeeExample();
		EmployeeExample.Criteria criteria = example.createCriteria();
		// 不显示超级管理员
		criteria.andEmployeeIdNotEqualTo(1);
		// 不显示自己
		criteria.andEmployeeIdNotEqualTo(employee.getEmployeeId());
		List<Employee> list = employeeMapper.customizationSelectByExample(example);
		PageInfo<Employee> pageInfo = new PageInfo<Employee>(list);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public Employee getEmployeeByPrimaryKey(Integer employeeId) {
		if (employeeId == 1) {
			return null;
		}
		return employeeMapper.customizationSelectByPrimaryKey(employeeId);
	}

	@Override
	public Employee getEmployeeByWhere(Employee employee) {
		EmployeeExample example = new EmployeeExample();
		EmployeeExample.Criteria criteria = example.createCriteria();
		criteria.andEmployeeLoginNameEqualTo(employee.getEmployeeLoginName());
		List<Employee> list = employeeMapper.customizationSelectByExample(example);
		if (list.isEmpty() || list.size() > 1) {
			return null;
		}
		return list.get(0);
	}

	@Override
	@Transactional(rollbackFor = { RuntimeException.class, Exception.class })
	public int saveOrUpdate(Employee employee) {
		if (employee.getEmployeeId() == null) {
			Employee foundEmployee = getEmployeeByWhere(employee);
			if(foundEmployee!=null) {
				return -1;
			}
			employee.setEmployeeNickName(MyUtils.getRandomNickName());
			employeeMapper.insertSelective(employee);
			return employeeInfoMapper.insertSelective(new EmployeeInfo(employee.getEmployeeId()));
		} else {
			if(employee.getEmployeeInfo()!=null) {
				employeeInfoMapper.updateByPrimaryKeySelective(employee.getEmployeeInfo());
			}
			return employeeMapper.updateByPrimaryKeySelective(employee);
		}
	}

}
