package com.aaa.entity;

/**
 * Registeredtype entity. @author MyEclipse Persistence Tools
 */

public class Registeredtype implements java.io.Serializable {

	// Fields

	private Integer id;
	private Clinicregister clinicregister;
	private String name;

	// Constructors

	/** default constructor */
	public Registeredtype() {
	}

	/** full constructor */
	public Registeredtype(Clinicregister clinicregister, String name) {
		this.clinicregister = clinicregister;
		this.name = name;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Clinicregister getClinicregister() {
		return this.clinicregister;
	}

	public void setClinicregister(Clinicregister clinicregister) {
		this.clinicregister = clinicregister;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}