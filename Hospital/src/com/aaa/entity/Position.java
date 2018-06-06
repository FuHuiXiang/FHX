package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Position entity. @author MyEclipse Persistence Tools
 */

public class Position implements java.io.Serializable {

	// Fields

	private Integer positionid;
	private String positionname;
	private Set stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Position() {
	}

	/** full constructor */
	public Position(String positionname, Set stuffs) {
		this.positionname = positionname;
		this.stuffs = stuffs;
	}

	// Property accessors

	public Integer getPositionid() {
		return this.positionid;
	}

	public void setPositionid(Integer positionid) {
		this.positionid = positionid;
	}

	public String getPositionname() {
		return this.positionname;
	}

	public void setPositionname(String positionname) {
		this.positionname = positionname;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

}