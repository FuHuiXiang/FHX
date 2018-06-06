package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Schedule entity. @author MyEclipse Persistence Tools
 */

public class Schedule implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String week;
	private Set scheduleitems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Schedule() {
	}

	/** full constructor */
	public Schedule(String week, Set scheduleitems) {
		this.week = week;
		this.scheduleitems = scheduleitems;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public String getWeek() {
		return this.week;
	}

	public void setWeek(String week) {
		this.week = week;
	}

	public Set getScheduleitems() {
		return this.scheduleitems;
	}

	public void setScheduleitems(Set scheduleitems) {
		this.scheduleitems = scheduleitems;
	}

}