package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Scheduletype entity. @author MyEclipse Persistence Tools
 */

public class Scheduletype implements java.io.Serializable {

	// Fields

	private Integer ptid;
	private String SName;
	private Set scheduleitems = new HashSet(0);

	// Constructors

	/** default constructor */
	public Scheduletype() {
	}

	/** full constructor */
	public Scheduletype(String SName, Set scheduleitems) {
		this.SName = SName;
		this.scheduleitems = scheduleitems;
	}

	// Property accessors

	public Integer getPtid() {
		return this.ptid;
	}

	public void setPtid(Integer ptid) {
		this.ptid = ptid;
	}

	public String getSName() {
		return this.SName;
	}

	public void setSName(String SName) {
		this.SName = SName;
	}

	public Set getScheduleitems() {
		return this.scheduleitems;
	}

	public void setScheduleitems(Set scheduleitems) {
		this.scheduleitems = scheduleitems;
	}

}