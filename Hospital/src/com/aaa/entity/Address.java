package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Address entity. @author MyEclipse Persistence Tools
 */

public class Address implements java.io.Serializable {

	// Fields

	private Integer aid;
	private String aname;
	private Set drugs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Address() {
	}

	/** full constructor */
	public Address(String aname, Set drugs) {
		this.aname = aname;
		this.drugs = drugs;
	}

	// Property accessors

	public Integer getAid() {
		return this.aid;
	}

	public void setAid(Integer aid) {
		this.aid = aid;
	}

	public String getAname() {
		return this.aname;
	}

	public void setAname(String aname) {
		this.aname = aname;
	}

	public Set getDrugs() {
		return this.drugs;
	}

	public void setDrugs(Set drugs) {
		this.drugs = drugs;
	}

}