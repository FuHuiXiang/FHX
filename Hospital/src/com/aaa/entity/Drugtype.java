package com.aaa.entity;

/**
 * Drugtype entity. @author MyEclipse Persistence Tools
 */

public class Drugtype implements java.io.Serializable {

	// Fields

	private Integer id;
	private Prescribe prescribe;
	private String name;

	// Constructors

	/** default constructor */
	public Drugtype() {
	}

	/** full constructor */
	public Drugtype(Prescribe prescribe, String name) {
		this.prescribe = prescribe;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Prescribe getPrescribe() {
		return this.prescribe;
	}

	public void setPrescribe(Prescribe prescribe) {
		this.prescribe = prescribe;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}