package com.aaa.entity;

/**
 * Relationship42 entity. @author MyEclipse Persistence Tools
 */

public class Relationship42 implements java.io.Serializable {

	// Fields

	private Relationship42Id id;

	// Constructors

	/** default constructor */
	public Relationship42() {
	}

	/** full constructor */
	public Relationship42(Relationship42Id id) {
		this.id = id;
	}

	// Property accessors

	public Relationship42Id getId() {
		return this.id;
	}

	public void setId(Relationship42Id id) {
		this.id = id;
	}

}