package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Bqtype entity. @author MyEclipse Persistence Tools
 */

public class Bqtype implements java.io.Serializable {

	// Fields

	private Integer bqtypeid;
	private String bqtypename;
	private Set inpatientareas = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bqtype() {
	}

	/** full constructor */
	public Bqtype(String bqtypename, Set inpatientareas) {
		this.bqtypename = bqtypename;
		this.inpatientareas = inpatientareas;
	}

	// Property accessors

	public Integer getBqtypeid() {
		return this.bqtypeid;
	}

	public void setBqtypeid(Integer bqtypeid) {
		this.bqtypeid = bqtypeid;
	}

	public String getBqtypename() {
		return this.bqtypename;
	}

	public void setBqtypename(String bqtypename) {
		this.bqtypename = bqtypename;
	}

	public Set getInpatientareas() {
		return this.inpatientareas;
	}

	public void setInpatientareas(Set inpatientareas) {
		this.inpatientareas = inpatientareas;
	}

}