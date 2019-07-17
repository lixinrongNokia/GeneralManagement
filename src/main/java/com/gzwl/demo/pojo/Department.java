package com.gzwl.demo.pojo;

public class Department implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 905866684800860427L;

	/** 部门id*/
    private Integer departmentId;

    /** 部门名称*/
    private String departmentName;

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName == null ? null : departmentName.trim();
    }
}