package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Yzmoid entity. @author MyEclipse Persistence Tools
 */

public class Yzmoid implements java.io.Serializable {

	// Fields

	private Integer yzid;
	private String yztype;
	private String yzremarks;
	private Set advices = new HashSet(0);

	// Constructors

	/** default constructor */
	public Yzmoid() {
	}

	/** full constructor */
	public Yzmoid(String yztype, String yzremarks, Set advices) {
		this.yztype = yztype;
		this.yzremarks = yzremarks;
		this.advices = advices;
	}

	// Property accessors

	public Integer getYzid() {
		return this.yzid;
	}

	public void setYzid(Integer yzid) {
		this.yzid = yzid;
	}

	public String getYztype() {
		return this.yztype;
	}

	public void setYztype(String yztype) {
		this.yztype = yztype;
	}

	public String getYzremarks() {
		return this.yzremarks;
	}

	public void setYzremarks(String yzremarks) {
		this.yzremarks = yzremarks;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

}