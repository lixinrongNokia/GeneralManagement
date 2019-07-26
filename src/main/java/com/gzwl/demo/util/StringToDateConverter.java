package com.gzwl.demo.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;
/**
 * 

* <p>Title: StringToDateConverter</p>  

* <p>Description:指定格式日期转换 </p>  

* @author lixinrong 

* @date 2019年3月29日
 */
public class StringToDateConverter implements Converter<String, Date> {
private static final int LEN=10;
	@Override
	public Date convert(String source) {
		try {
			if (source != null && !source.isEmpty()) {
				// 进行日期转换
				if (source.length() > LEN) {
					return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(source);
				} else {
					return new SimpleDateFormat("yyyy-MM-dd").parse(source);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
