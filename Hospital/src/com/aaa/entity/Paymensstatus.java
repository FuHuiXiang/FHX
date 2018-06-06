package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Paymensstatus entity. @author MyEclipse Persistence Tools
 */

public class Paymensstatus implements java.io.Serializable {

	// Fields

	private Integer psId;
	private String psName;
	private Set rukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Paymensstatus() {
	}

	/** full constructor */
	public Paymensstatus(String psName, Set rukus) {
		this.psName = psName;
		this.rukus = rukus;
	}

	// Property accessors

	public Integer getPsId() {
		return this.psId;
	}

	public void setPsId(Integer psId) {
		this.psId = psId;
	}

	public String getPsName() {
		return this.psName;
	}

	public void setPsName(String psName) {
		this.psName = psName;
	}

	public Set getRukus() {
		return this.rukus;
	}

	public void setRukus(Set rukus) {
		this.rukus = rukus;
	}

}