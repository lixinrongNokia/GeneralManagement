package com.gzwl.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzwl.demo.pojo.EmployeeInfo;
import com.gzwl.demo.pojo.EmployeeInfoExample;

public interface EmployeeInfoMapper {
    int countByExample(EmployeeInfoExample example);

    int deleteByExample(EmployeeInfoExample example);

    int deleteByPrimaryKey(Integer employeeId);

    int insert(EmployeeInfo record);

    int insertSelective(EmployeeInfo record);

    List<EmployeeInfo> selectByExample(EmployeeInfoExample example);

    EmployeeInfo selectByPrimaryKey(Integer employeeId);

    int updateByExampleSelective(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByExample(@Param("record") EmployeeInfo record, @Param("example") EmployeeInfoExample example);

    int updateByPrimaryKeySelective(EmployeeInfo record);

    int updateByPrimaryKey(EmployeeInfo record);
}