package com.gzwl.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.gzwl.demo.pojo.Dictionary;
import com.gzwl.demo.pojo.DictionaryExample;

public interface DictionaryMapper {
    long countByExample(DictionaryExample example);

    int deleteByExample(DictionaryExample example);

    int deleteByPrimaryKey(Integer dkId);

    int insert(Dictionary record);

    /**
     * 新增
     * @param record
     * @return
     */
    int insertSelective(Dictionary record);

    /**
     * 查询 or 条件查询
     * @param example
     * @return
     */
    List<Dictionary> selectByExample(DictionaryExample example);
    /**
     * 
     * @Title: customizationSelectByExample 
     * @Desc: 定制查询 
     * @param example
     * @return
     */
    List<Dictionary> customizationSelectByExample(DictionaryExample example);

    /**
     * 根据id查询
     * @param dkId
     * @return
     */
    Dictionary selectByPrimaryKey(Integer dkId);

    int updateByExampleSelective(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    int updateByExample(@Param("record") Dictionary record, @Param("example") DictionaryExample example);

    /**
     * 修改
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(Dictionary record);

    int updateByPrimaryKey(Dictionary record);
}