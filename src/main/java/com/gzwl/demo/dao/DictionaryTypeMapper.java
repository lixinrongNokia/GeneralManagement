package com.gzwl.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzwl.demo.pojo.DictionaryType;
import com.gzwl.demo.pojo.DictionaryTypeExample;

public interface DictionaryTypeMapper {
    long countByExample(DictionaryTypeExample example);

    int deleteByExample(DictionaryTypeExample example);

    int deleteByPrimaryKey(Integer dtkId);

    int insert(DictionaryType record);

    /**
     * 新增
     * @param record
     * @return
     */
    int insertSelective(DictionaryType record);

    /**
     * 查询 or 条件查询
     * @param example
     * @return
     */
    List<DictionaryType> selectByExample(DictionaryTypeExample example);
    /**
     * 
     * @Title: customizationSelectByExample 
     * @Desc: 定制查询 
     * @param example
     * @return
     */
    List<DictionaryType> customizationSelectByExample(DictionaryTypeExample example);

    /**
     * 根据id查询
     * @param dtkId
     * @return
     */
    DictionaryType selectByPrimaryKey(Integer dtkId);

    int updateByExampleSelective(@Param("record") DictionaryType record, @Param("example") DictionaryTypeExample example);

    int updateByExample(@Param("record") DictionaryType record, @Param("example") DictionaryTypeExample example);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(DictionaryType record);

    int updateByPrimaryKey(DictionaryType record);
}