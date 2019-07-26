package com.gzwl.demo.search;
/**
 * 
 * @ClassName: BaseFormBean
 * @Desc: 前端页面表单对象基类
 * @author: lxr
 * @date: 2019年6月4日 下午5:20:39
 * @version 1.0
 */
public class BaseFormBean {
	/** 页码 */
	protected int page;
	/** 条目数 */
	protected int limit;
	/** 开始时间 */
	private String beginDate;
	/** 结束时间*/
   	private String endDate;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	public String getBeginDate() {
		return beginDate;
	}

	public void setBeginDate(String beginDate) {
		this.beginDate = beginDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	
	
}
