package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Stufftype entity. @author MyEclipse Persistence Tools
 */

public class Stufftype implements java.io.Serializable {

	// Fields

	private Integer stuffTypeId;
	private String stuffTypeName;
	private Set stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stufftype() {
	}

	/** full constructor */
	public Stufftype(String stuffTypeName, Set stuffs) {
		this.stuffTypeName = stuffTypeName;
		this.stuffs = stuffs;
	}

	// Property accessors

	public Integer getStuffTypeId() {
		return this.stuffTypeId;
	}

	public void setStuffTypeId(Integer stuffTypeId) {
		this.stuffTypeId = stuffTypeId;
	}

	public String getStuffTypeName() {
		return this.stuffTypeName;
	}

	public void setStuffTypeName(String stuffTypeName) {
		this.stuffTypeName = stuffTypeName;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

}