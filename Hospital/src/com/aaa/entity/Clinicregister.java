package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Clinicregister entity. @author MyEclipse Persistence Tools
 */

public class Clinicregister implements java.io.Serializable {

	// Fields

	private Integer registerId;
	private Patients patients;
	private Integer serialNumber;
	private Integer iphone;
	private Date presentTime;
	private Set registeredtypes = new HashSet(0);
	private Set offices = new HashSet(0);
	private Set stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Clinicregister() {
	}

	/** full constructor */
	public Clinicregister(Patients patients, Integer serialNumber, Integer iphone, Date presentTime,
			Set registeredtypes, Set offices, Set stuffs) {
		this.patients = patients;
		this.serialNumber = serialNumber;
		this.iphone = iphone;
		this.presentTime = presentTime;
		this.registeredtypes = registeredtypes;
		this.offices = offices;
		this.stuffs = stuffs;
	}

	// Property accessors

	public Integer getRegisterId() {
		return this.registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public Integer getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
	}

	public Integer getIphone() {
		return this.iphone;
	}

	public void setIphone(Integer iphone) {
		this.iphone = iphone;
	}

	public Date getPresentTime() {
		return this.presentTime;
	}

	public void setPresentTime(Date presentTime) {
		this.presentTime = presentTime;
	}

	public Set getRegisteredtypes() {
		return this.registeredtypes;
	}

	public void setRegisteredtypes(Set registeredtypes) {
		this.registeredtypes = registeredtypes;
	}

	public Set getOffices() {
		return this.offices;
	}

	public void setOffices(Set offices) {
		this.offices = offices;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

}