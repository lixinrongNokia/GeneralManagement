package com.gzwl.demo.service.sys;

import java.util.List;

import com.gzwl.demo.pojo.DictionaryType;
import com.gzwl.demo.search.sys.DictionaryTypeSearch;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * @version:1.0
 * @Description:字典类型的接口类
 * @author:李云飞
 * @date: 2019年3月29日上午11:46:32
 */
public interface DictionaryTypeService {

	/**
	 * 新增
	 * @param lwDictionaryType
	 * @return
	 */
	public int insert(DictionaryType dictionaryType);
	
	/**
	 * 修改
	 * @param lwDictionaryType
	 * @return
	 */
	public int updateSelective(DictionaryType dictionaryType);
	
	/**
	 * 查询所有表（只查询表类型的）
	 * @return
	 */
	public List<DictionaryType> ListByTable();
	
	/**
	 * 查询 or 条件查询
	 * @param lwDictionaryTypeSearch
	 * @return
	 */
	public ResultUtil ListByPage(DictionaryTypeSearch dictionaryTypeSearch);
	
	/**
	 * 根据id查询
	 * @param dtkId
	 * @return
	 */
	public DictionaryType getById(Integer dtkId);

	/**
	 * 根据父ID查询
	 * @param dtParentId
	 * @return
	 */
  	public List<DictionaryType> ListByParentId(Integer dtParentId);
	
}
