package com.gzwl.demo.search.sys;

import java.util.Date;

/**
 * 
 * @version:1.0
 * @Description:字典条件类
 * @author:李云飞
 * @date: 2019年4月3日上午10:32:13
 */
public class DictionarySearch {
    private Integer dkId;

    private String dictionaryTable;

    private String dictionaryColum;

    private String dictionaryValue;

    private Integer dictionarySerialNumber;

    private Integer dictionaryStatus;

    private String dictionaryRemarks;

    private Date dCreationTime;

    private Date dModificationTime;

    private Integer dOperator;
    
    private Integer page;      //页码
   	private Integer limit;     //页条数
   	private String beginDate;     //开始时间
   	private String endDate;     //结束时间
	public Integer getDkId() {
		return dkId;
	}
	public void setDkId(Integer dkId) {
		this.dkId = dkId;
	}
	public String getDictionaryTable() {
		return dictionaryTable;
	}
	public void setDictionaryTable(String dictionaryTable) {
		this.dictionaryTable = dictionaryTable;
	}
	public String getDictionaryColum() {
		return dictionaryColum;
	}
	public void setDictionaryColum(String dictionaryColum) {
		this.dictionaryColum = dictionaryColum;
	}
	public String getDictionaryValue() {
		return dictionaryValue;
	}
	public void setDictionaryValue(String dictionaryValue) {
		this.dictionaryValue = dictionaryValue;
	}
	public Integer getDictionarySerialNumber() {
		return dictionarySerialNumber;
	}
	public void setDictionarySerialNumber(Integer dictionarySerialNumber) {
		this.dictionarySerialNumber = dictionarySerialNumber;
	}
	public Integer getDictionaryStatus() {
		return dictionaryStatus;
	}
	public void setDictionaryStatus(Integer dictionaryStatus) {
		this.dictionaryStatus = dictionaryStatus;
	}
	public String getDictionaryRemarks() {
		return dictionaryRemarks;
	}
	public void setDictionaryRemarks(String dictionaryRemarks) {
		this.dictionaryRemarks = dictionaryRemarks;
	}
	public Date getdCreationTime() {
		return dCreationTime;
	}
	public void setdCreationTime(Date dCreationTime) {
		this.dCreationTime = dCreationTime;
	}
	public Date getdModificationTime() {
		return dModificationTime;
	}
	public void setdModificationTime(Date dModificationTime) {
		this.dModificationTime = dModificationTime;
	}
	public Integer getdOperator() {
		return dOperator;
	}
	public void setdOperator(Integer dOperator) {
		this.dOperator = dOperator;
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
		return "LwDictionarySearch [dkId=" + dkId + ", dictionaryTable="
				+ dictionaryTable + ", dictionaryColum=" + dictionaryColum
				+ ", dictionaryValue=" + dictionaryValue
				+ ", dictionarySerialNumber=" + dictionarySerialNumber
				+ ", dictionaryStatus=" + dictionaryStatus
				+ ", dictionaryRemarks=" + dictionaryRemarks
				+ ", dCreationTime=" + dCreationTime + ", dModificationTime="
				+ dModificationTime + ", dOperator=" + dOperator + ", page="
				+ page + ", limit=" + limit + ", beginDate=" + beginDate
				+ ", endDate=" + endDate + "]";
	}
   	
}