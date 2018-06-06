package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Dosageform entity. @author MyEclipse Persistence Tools
 */

public class Dosageform implements java.io.Serializable {

	// Fields

	private Integer dfId;
	private String dfName;
	private Set drugs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Dosageform() {
	}

	/** full constructor */
	public Dosageform(String dfName, Set drugs) {
		this.dfName = dfName;
		this.drugs = drugs;
	}

	// Property accessors

	public Integer getDfId() {
		return this.dfId;
	}

	public void setDfId(Integer dfId) {
		this.dfId = dfId;
	}

	public String getDfName() {
		return this.dfName;
	}

	public void setDfName(String dfName) {
		this.dfName = dfName;
	}

	public Set getDrugs() {
		return this.drugs;
	}

	public void setDrugs(Set drugs) {
		this.drugs = drugs;
	}

}