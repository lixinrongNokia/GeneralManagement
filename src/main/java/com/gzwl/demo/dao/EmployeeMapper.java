package com.gzwl.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzwl.demo.pojo.Employee;
import com.gzwl.demo.pojo.EmployeeExample;

public interface EmployeeMapper {
    int countByExample(EmployeeExample example);

    int deleteByExample(EmployeeExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(Employee record);

    int insertSelective(Employee record);

    List<Employee> selectByExample(EmployeeExample example);
    
    List<Employee> customizationSelectByExample(EmployeeExample example);

    Employee selectByPrimaryKey(Integer employeeId);
    
    Employee customizationSelectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByExample(@Param("record") Employee record, @Param("example") EmployeeExample example);

    int updateByPrimaryKeySelective(Employee record);

    int updateByPrimaryKey(Employee record);
}