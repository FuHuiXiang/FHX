package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Jobtitle entity. @author MyEclipse Persistence Tools
 */

public class Jobtitle implements java.io.Serializable {

	// Fields

	private Integer jobTitleId;
	private String jobTitleName;
	private Set stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Jobtitle() {
	}

	/** full constructor */
	public Jobtitle(String jobTitleName, Set stuffs) {
		this.jobTitleName = jobTitleName;
		this.stuffs = stuffs;
	}

	// Property accessors

	public Integer getJobTitleId() {
		return this.jobTitleId;
	}

	public void setJobTitleId(Integer jobTitleId) {
		this.jobTitleId = jobTitleId;
	}

	public String getJobTitleName() {
		return this.jobTitleName;
	}

	public void setJobTitleName(String jobTitleName) {
		this.jobTitleName = jobTitleName;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

}