package com.gzwl.demo.service.sys.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gzwl.demo.pojo.DictionaryType;
import com.gzwl.demo.pojo.DictionaryTypeExample;
import com.gzwl.demo.search.sys.DictionaryTypeSearch;
import com.gzwl.demo.service.AbstraceService;
import com.gzwl.demo.service.sys.DictionaryTypeService;
import com.gzwl.demo.util.ResultUtil;
/**
 * 
 * @version:1.0
 * @Description:字典类型的接口实现类
 * @author:李云飞
 * @date: 2019年3月29日上午11:47:01
 */
@Service
@Transactional
public class DictionaryTypeServiceImpl extends AbstraceService implements DictionaryTypeService {

	/**
	 * 新增
	 */
	@Override
	public int insert(DictionaryType dictionaryType) {
		return dictionaryTypeMapper.insertSelective(dictionaryType);
	}

	/**
	 * 修改
	 */
	@Override
	public int updateSelective(DictionaryType dictionaryType) {
		return dictionaryTypeMapper.updateByPrimaryKeySelective(dictionaryType);
	}

	/**
	 * 查询所有表（只查询表类型的）
	 * 
	 * @return
	 */
	public List<DictionaryType> ListByTable() {
		DictionaryTypeExample example = new DictionaryTypeExample();
		DictionaryTypeExample.Criteria criteria = example.createCriteria();
		criteria.andDictionaryTypeTypeEqualTo_alias("1");
		return dictionaryTypeMapper.customizationSelectByExample(example);
	}

	/**
	 * 查询 or 条件查询
	 */
	@Override
	public ResultUtil ListByPage(DictionaryTypeSearch dictionaryTypeSearch) {
		PageHelper.startPage(dictionaryTypeSearch.getPage(), dictionaryTypeSearch.getLimit());
		DictionaryTypeExample example = new DictionaryTypeExample();
		
		DictionaryTypeExample.Criteria criteria = example.createCriteria();

		if (null != dictionaryTypeSearch.getDictionaryTypeName()
				&& !"".equals(dictionaryTypeSearch.getDictionaryTypeName())) {
			criteria.andDictionaryTypeNameLike_alias("%" + dictionaryTypeSearch.getDictionaryTypeName() + "%");
		}

		if (null != dictionaryTypeSearch.getDictionaryTypeValue()
				&& !"".equals(dictionaryTypeSearch.getDictionaryTypeValue())) {
			criteria.andDictionaryTypeValueLike_alias("%" + dictionaryTypeSearch.getDictionaryTypeValue() + "%");
		}

		if (null != dictionaryTypeSearch.getDictionaryTypeType()
				&& !"".equals(dictionaryTypeSearch.getDictionaryTypeType())) {
			criteria.andDictionaryTypeTypeEqualTo_alias(dictionaryTypeSearch.getDictionaryTypeType());
		}

		List<DictionaryType> logs = dictionaryTypeMapper.customizationSelectByExample(example);
		PageInfo<DictionaryType> pageInfo = new PageInfo<DictionaryType>(logs);
		ResultUtil resultUtil = new ResultUtil();
		resultUtil.setCode(0);
		resultUtil.setCount(pageInfo.getTotal());
		resultUtil.setData(pageInfo.getList());
		return resultUtil;
	}

	/**
	 * 根据id查询
	 */
	@Override
	public DictionaryType getById(Integer dictionaryTypeId) {
		return dictionaryTypeMapper.selectByPrimaryKey(dictionaryTypeId);
	}

	/**
	 * 根据父ID查询
	 */
	@Override
	public List<DictionaryType> ListByParentId(Integer parentId) {
		DictionaryTypeExample example = new DictionaryTypeExample();
		DictionaryTypeExample.Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo_alias(parentId);
		return dictionaryTypeMapper.customizationSelectByExample(example);
	}

}
