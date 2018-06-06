package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Drugtype2 entity. @author MyEclipse Persistence Tools
 */

public class Drugtype2 implements java.io.Serializable {

	// Fields

	private Integer dtId;
	private String dtName;
	private Set drugs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Drugtype2() {
	}

	/** full constructor */
	public Drugtype2(String dtName, Set drugs) {
		this.dtName = dtName;
		this.drugs = drugs;
	}

	// Property accessors

	public Integer getDtId() {
		return this.dtId;
	}

	public void setDtId(Integer dtId) {
		this.dtId = dtId;
	}

	public String getDtName() {
		return this.dtName;
	}

	public void setDtName(String dtName) {
		this.dtName = dtName;
	}

	public Set getDrugs() {
		return this.drugs;
	}

	public void setDrugs(Set drugs) {
		this.drugs = drugs;
	}

}