package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Doseunit entity. @author MyEclipse Persistence Tools
 */

public class Doseunit implements java.io.Serializable {

	// Fields

	private Integer duId;
	private String duName;
	private Set drugs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Doseunit() {
	}

	/** full constructor */
	public Doseunit(String duName, Set drugs) {
		this.duName = duName;
		this.drugs = drugs;
	}

	// Property accessors

	public Integer getDuId() {
		return this.duId;
	}

	public void setDuId(Integer duId) {
		this.duId = duId;
	}

	public String getDuName() {
		return this.duName;
	}

	public void setDuName(String duName) {
		this.duName = duName;
	}

	public Set getDrugs() {
		return this.drugs;
	}

	public void setDrugs(Set drugs) {
		this.drugs = drugs;
	}

}