package com.gzwl.demo.search.sys;

import java.util.Date;

/**
 * 
 * @version:1.0
 * @Description:字典类型条件类
 * @author:李云飞
 * @date: 2019年4月3日上午10:32:32
 */
public class DictionaryTypeSearch {
    private Integer dtkId;

    private String dictionaryTypeName;

    private String dictionaryTypeValue;

    private String dictionaryTypeType;

    private Integer dtParentId;

    private Date dtCreationTime;

    private Date dtModificationTime;

    private Integer dtOperator;
    
    private Integer page;      //页码
   	private Integer limit;     //页条数
   	private String beginDate;     //开始时间
   	private String endDate;     //结束时间
	public Integer getDtkId() {
		return dtkId;
	}
	public void setDtkId(Integer dtkId) {
		this.dtkId = dtkId;
	}
	public String getDictionaryTypeName() {
		return dictionaryTypeName;
	}
	public void setDictionaryTypeName(String dictionaryTypeName) {
		this.dictionaryTypeName = dictionaryTypeName;
	}
	public String getDictionaryTypeValue() {
		return dictionaryTypeValue;
	}
	public void setDictionaryTypeValue(String dictionaryTypeValue) {
		this.dictionaryTypeValue = dictionaryTypeValue;
	}
	public String getDictionaryTypeType() {
		return dictionaryTypeType;
	}
	public void setDictionaryTypeType(String dictionaryTypeType) {
		this.dictionaryTypeType = dictionaryTypeType;
	}
	public Integer getDtParentId() {
		return dtParentId;
	}
	public void setDtParentId(Integer dtParentId) {
		this.dtParentId = dtParentId;
	}
	public Date getDtCreationTime() {
		return dtCreationTime;
	}
	public void setDtCreationTime(Date dtCreationTime) {
		this.dtCreationTime = dtCreationTime;
	}
	public Date getDtModificationTime() {
		return dtModificationTime;
	}
	public void setDtModificationTime(Date dtModificationTime) {
		this.dtModificationTime = dtModificationTime;
	}
	public Integer getDtOperator() {
		return dtOperator;
	}
	public void setDtOperator(Integer dtOperator) {
		this.dtOperator = dtOperator;
	}
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
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
	@Override
	public String toString() {
		return "LwDictionaryTypeSearch [dtkId=" + dtkId
				+ ", dictionaryTypeName=" + dictionaryTypeName
				+ ", dictionaryTypeValue=" + dictionaryTypeValue
				+ ", dictionaryTypeType=" + dictionaryTypeType
				+ ", dtParentId=" + dtParentId + ", dtCreationTime="
				+ dtCreationTime + ", dtModificationTime=" + dtModificationTime
				+ ", dtOperator=" + dtOperator + ", page=" + page + ", limit="
				+ limit + ", beginDate=" + beginDate + ", endDate=" + endDate
				+ "]";
	}
   	
}