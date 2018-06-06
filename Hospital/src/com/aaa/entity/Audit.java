package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Audit entity. @author MyEclipse Persistence Tools
 */

public class Audit implements java.io.Serializable {

	// Fields

	private Integer auId;
	private String auName;
	private Set chukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Audit() {
	}

	/** full constructor */
	public Audit(String auName, Set chukus) {
		this.auName = auName;
		this.chukus = chukus;
	}

	// Property accessors

	public Integer getAuId() {
		return this.auId;
	}

	public void setAuId(Integer auId) {
		this.auId = auId;
	}

	public String getAuName() {
		return this.auName;
	}

	public void setAuName(String auName) {
		this.auName = auName;
	}

	public Set getChukus() {
		return this.chukus;
	}

	public void setChukus(Set chukus) {
		this.chukus = chukus;
	}

}