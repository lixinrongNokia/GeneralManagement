package com.gzwl.demo.pojo;

public class EmployeeInfo implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2568488222064417052L;

	/** 员工id */
	private Integer employeeId;

	/** 员工名称 */
	private String employeeName;

	/** 员工性别 */
	private String employeeSex;

	/** 员工邮箱 */
	private String employeeEmail;

	/** 员工电话 */
	private String employeePhone;

	/** 员工通讯地址 */
	private String employeeAddr;

	public EmployeeInfo() {
	}

	public EmployeeInfo(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public Integer getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Integer employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = (employeeName == null || employeeName.trim() == "") ? null : employeeName.trim();
	}

	public String getEmployeeSex() {
		return employeeSex;
	}

	public void setEmployeeSex(String employeeSex) {
		this.employeeSex = employeeSex == null ? null : employeeSex.trim();
	}

	public String getEmployeeEmail() {
		return employeeEmail;
	}

	public void setEmployeeEmail(String employeeEmail) {
		this.employeeEmail = (employeeEmail == null || employeeEmail.trim() == "") ? null : employeeEmail.trim();
	}

	public String getEmployeePhone() {
		return employeePhone;
	}

	public void setEmployeePhone(String employeePhone) {
		this.employeePhone = (employeePhone == null || employeePhone.trim() == "") ? null : employeePhone.trim();
	}

	public String getEmployeeAddr() {
		return employeeAddr;
	}

	public void setEmployeeAddr(String employeeAddr) {
		this.employeeAddr = (employeeAddr == null || employeeAddr.trim() == "") ? null : employeeAddr.trim();
	}
}