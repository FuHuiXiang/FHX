package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Supplier entity. @author MyEclipse Persistence Tools
 */

public class Supplier implements java.io.Serializable {

	// Fields

	private Integer sid;
	private String company;
	private String linkman;
	private Integer phone2;
	private String address5;
	private Set rukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Supplier() {
	}

	/** full constructor */
	public Supplier(String company, String linkman, Integer phone2, String address5, Set rukus) {
		this.company = company;
		this.linkman = linkman;
		this.phone2 = phone2;
		this.address5 = address5;
		this.rukus = rukus;
	}

	// Property accessors

	public Integer getSid() {
		return this.sid;
	}

	public void setSid(Integer sid) {
		this.sid = sid;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLinkman() {
		return this.linkman;
	}

	public void setLinkman(String linkman) {
		this.linkman = linkman;
	}

	public Integer getPhone2() {
		return this.phone2;
	}

	public void setPhone2(Integer phone2) {
		this.phone2 = phone2;
	}

	public String getAddress5() {
		return this.address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public Set getRukus() {
		return this.rukus;
	}

	public void setRukus(Set rukus) {
		this.rukus = rukus;
	}

}