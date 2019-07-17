package com.gzwl.demo.pojo;

public class Job implements java.io.Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -2351925720542848526L;

	/** 职位id*/
    private Integer jobId;

    /** 职位名称*/
    private String jobName;

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName == null ? null : jobName.trim();
    }
}