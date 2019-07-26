package com.gzwl.demo.service.sys;

import java.util.List;

import com.gzwl.demo.pojo.Dictionary;
import com.gzwl.demo.search.sys.DictionarySearch;
import com.gzwl.demo.util.ResultUtil;


/**
 * 
 * @version:1.0
 * @Description:字典的接口类
 * @author:李云飞
 * @date: 2019年3月29日上午11:46:32
 */
public interface DictionaryService {
	
	/**
	 * 新增
	 * @param dictionary
	 * @return
	 */
	public int insert(Dictionary dictionary);
	
	/**
	 * 修改
	 * @param lwDictionary
	 * @return
	 */
	public int updateSelective(Dictionary dictionary);
	
	/**
	 * 根据id查询
	 * @param dkId
	 * @return
	 */
	public Dictionary getById(Integer dkId);
	
	/**
	 * 查询 or 条件查询
	 * @param lwDictionarySearch
	 * @return
	 */
	public ResultUtil ListByPage(DictionarySearch dictionarySearch);
	
	/**
	 * 根据字典表名称和字段名称查询字典
	 * @param lwDictionary
	 * @return
	 */
	public List<Dictionary> ListByTableAndColum(Dictionary dictionary);

}
