package com.aaa.entity;

/**
 * Chargetype entity. @author MyEclipse Persistence Tools
 */

public class Chargetype implements java.io.Serializable {

	// Fields

	private Integer sftId;
	private String name;

	// Constructors

	/** default constructor */
	public Chargetype() {
	}

	/** full constructor */
	public Chargetype(String name) {
		this.name = name;
	}

	// Property accessors

	public Integer getSftId() {
		return this.sftId;
	}

	public void setSftId(Integer sftId) {
		this.sftId = sftId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}