package com.gzwl.demo.service.personnel.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gzwl.demo.dao.DepartmentMapper;
import com.gzwl.demo.pojo.Department;
import com.gzwl.demo.pojo.DepartmentExample;
import com.gzwl.demo.search.personnel.DepartmentFormBean;
import com.gzwl.demo.service.personnel.DepartmentService;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * @ClassName: DepartmentServiceImpl
 * @Desc: 部门业务接口实现
 * @author: lxr
 * @date: 2019年6月17日 上午10:32:11
 * @version 1.0
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

	@Resource
	private DepartmentMapper departmentMapper;

	@Override
	public int deleteByPrimaryKey(Integer departmentId) {
		return departmentMapper.deleteByPrimaryKey(departmentId);
	}

	@Override
	public ResultUtil listDepartment(DepartmentFormBean departmentFormBean) {
		PageHelper.startPage(departmentFormBean.getPage(), departmentFormBean.getLimit());
		PageInfo<Department> pageInfo = new PageInfo<Department>(departmentMapper.selectByExample(null));
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		resultUtil.setCode(0);
		return resultUtil;
	}

	@Override
	public List<Department> listDepartmentNonSort() {
		return departmentMapper.selectByExample(null);
	}

	@Override
	public int saveOrUpdate(Department department) {
		DepartmentExample example=new DepartmentExample();
		DepartmentExample.Criteria criteria = example.createCriteria();
		criteria.andDepartmentNameEqualTo(department.getDepartmentName());
		List<Department> list = departmentMapper.selectByExample(example);
		if(!list.isEmpty()) {
			return -1;
		}
		if (department.getDepartmentId() == null) {
			return departmentMapper.insertSelective(department);
		} else {
			return departmentMapper.updateByPrimaryKeySelective(department);
		}
	}

	@Override
	public Department getDepartmentById(Integer departmentId) {
		return departmentMapper.selectByPrimaryKey(departmentId);
	}

}
