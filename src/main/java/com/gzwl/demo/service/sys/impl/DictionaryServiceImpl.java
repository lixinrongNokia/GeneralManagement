package com.gzwl.demo.service.sys.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gzwl.demo.pojo.Dictionary;
import com.gzwl.demo.pojo.DictionaryExample;
import com.gzwl.demo.search.sys.DictionarySearch;
import com.gzwl.demo.service.AbstraceService;
import com.gzwl.demo.service.sys.DictionaryService;
import com.gzwl.demo.util.ResultUtil;

/**
 * 
 * @version:1.0
 * @Description:字典的接口实现类
 * @author:李云飞
 * @date: 2019年3月29日上午11:47:01
 */
@Service
@Transactional
public class DictionaryServiceImpl extends AbstraceService implements DictionaryService {

	/**
	 * 新增
	 */
	@Override
	public int insert(Dictionary dictionary) {
		return dictionaryMapper.insertSelective(dictionary);
	}

	/**
	 * 修改
	 */
	@Override
	public int updateSelective(Dictionary dictionary) {
		return dictionaryMapper.updateByPrimaryKeySelective(dictionary);
	}

	/**
	 * 根据id查询
	 */
	@Override
	public Dictionary getById(Integer dictionaryId) {
		return dictionaryMapper.selectByPrimaryKey(dictionaryId);
	}

	/**
	 * 查询 or 条件查询
	 */
	@Override
	public ResultUtil ListByPage(DictionarySearch dictionarySearch) {
		PageHelper.startPage(dictionarySearch.getPage(), dictionarySearch.getLimit());
		DictionaryExample example = new DictionaryExample();
		DictionaryExample.Criteria criteria = example.createCriteria();

		if (null != dictionarySearch.getDictionaryTable() && !"".equals(dictionarySearch.getDictionaryTable())) {
			criteria.andDictionaryTableEqualTo(dictionarySearch.getDictionaryTable());
		}

		if (null != dictionarySearch.getDictionaryColum() && !"".equals(dictionarySearch.getDictionaryColum())) {
			criteria.andDictionaryColumEqualTo(dictionarySearch.getDictionaryColum());
		}

		List<Dictionary> logs = dictionaryMapper.customizationSelectByExample(example);
		PageInfo<Dictionary> pageInfo = new PageInfo<Dictionary>(logs);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	/**
	 * 根据字典表名称和字段名称查询字典
	 */
	@Override
	public List<Dictionary> ListByTableAndColum(Dictionary lwDictionary) {
		DictionaryExample example = new DictionaryExample();
		DictionaryExample.Criteria criteria = example.createCriteria();
		criteria.andDictionaryTableEqualTo(lwDictionary.getDictionaryTable());
		criteria.andDictionaryColumEqualTo(lwDictionary.getDictionaryColum());
		criteria.andDictionaryStatusEqualTo(lwDictionary.getDictionaryStatus());
		return dictionaryMapper.customizationSelectByExample(example);
	}

}
