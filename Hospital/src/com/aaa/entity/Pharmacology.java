package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Pharmacology entity. @author MyEclipse Persistence Tools
 */

public class Pharmacology implements java.io.Serializable {

	// Fields

	private Integer pid2;
	private String pname2;
	private Set drugs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Pharmacology() {
	}

	/** full constructor */
	public Pharmacology(String pname2, Set drugs) {
		this.pname2 = pname2;
		this.drugs = drugs;
	}

	// Property accessors

	public Integer getPid2() {
		return this.pid2;
	}

	public void setPid2(Integer pid2) {
		this.pid2 = pid2;
	}

	public String getPname2() {
		return this.pname2;
	}

	public void setPname2(String pname2) {
		this.pname2 = pname2;
	}

	public Set getDrugs() {
		return this.drugs;
	}

	public void setDrugs(Set drugs) {
		this.drugs = drugs;
	}

}