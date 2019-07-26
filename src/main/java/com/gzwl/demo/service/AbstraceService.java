package com.gzwl.demo.service;

import javax.annotation.Resource;

import com.gzwl.demo.dao.DictionaryMapper;
import com.gzwl.demo.dao.DictionaryTypeMapper;

/**
 * 
 * 
 * <p>
 * Title: AbstraceService
 * </p>
 * 
 * <p>
 * Description: 公共业务基类
 * </p>
 * 
 * @author lixinrong
 * 
 * @date 2019年3月28日
 */
public abstract class AbstraceService {
	@Resource
	protected DictionaryMapper dictionaryMapper;
	@Resource
	protected DictionaryTypeMapper dictionaryTypeMapper;
}
