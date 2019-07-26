package com.gzwl.demo.pojo;


public class Employee implements java.io.Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 4121528311761921472L;

	/** 员工id*/
    private Integer employeeId;

    /** 员工登录名称*/
    private String employeeLoginName;

    /** 员工登录密码*/
    private String employeeLoginPassword;

    /** 员工昵称*/
    private String employeeNickName;

    /** 角色id*/
    private Integer roleId;

    /** 部门id*/
    private Integer departmentId;

    /** 职位id*/
    private Integer jobId;

    /** 状态(0未激活1正常)*/
    private Boolean employeeStatus;
    
    private EmployeeInfo employeeInfo;
    private Department department;
    private Role role;
    private Job job;

    public Employee() {}

	public Employee(String employeeLoginName) {
		this.employeeLoginName = employeeLoginName;
	}

	public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeLoginName() {
        return employeeLoginName;
    }

    public void setEmployeeLoginName(String employeeLoginName) {
        this.employeeLoginName = employeeLoginName == null ? null : employeeLoginName.trim();
    }

    public String getEmployeeLoginPassword() {
        return employeeLoginPassword;
    }

    public void setEmployeeLoginPassword(String employeeLoginPassword) {
        this.employeeLoginPassword = employeeLoginPassword == null ? null : employeeLoginPassword.trim();
    }

    public String getEmployeeNickName() {
        return employeeNickName;
    }

    public void setEmployeeNickName(String employeeNickName) {
        this.employeeNickName = employeeNickName == null ? null : employeeNickName.trim();
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }


	public Boolean getEmployeeStatus() {
		return employeeStatus;
	}

	public void setEmployeeStatus(Boolean employeeStatus) {
		this.employeeStatus = employeeStatus;
	}

	public EmployeeInfo getEmployeeInfo() {
		return employeeInfo;
	}

	public void setEmployeeInfo(EmployeeInfo employeeInfo) {
		this.employeeInfo = employeeInfo;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeLoginName=" + employeeLoginName
				+ ", employeeLoginPassword=" + employeeLoginPassword + ", employeeNickName=" + employeeNickName
				+ ", roleId=" + roleId + ", departmentId=" + departmentId + ", jobId=" + jobId + ", employeeStatus="
				+ employeeStatus + "]";
	}
}