package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Cure entity. @author MyEclipse Persistence Tools
 */

public class Cure implements java.io.Serializable {

	// Fields

	private Integer cureId;
	private Patients patients;
	private String cureType;
	private Integer cureNumber;
	private Integer feesState;
	private Integer state;
	private Set treatments = new HashSet(0);

	// Constructors

	/** default constructor */
	public Cure() {
	}

	/** full constructor */
	public Cure(Patients patients, String cureType, Integer cureNumber, Integer feesState, Integer state,
			Set treatments) {
		this.patients = patients;
		this.cureType = cureType;
		this.cureNumber = cureNumber;
		this.feesState = feesState;
		this.state = state;
		this.treatments = treatments;
	}

	// Property accessors

	public Integer getCureId() {
		return this.cureId;
	}

	public void setCureId(Integer cureId) {
		this.cureId = cureId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public String getCureType() {
		return this.cureType;
	}

	public void setCureType(String cureType) {
		this.cureType = cureType;
	}

	public Integer getCureNumber() {
		return this.cureNumber;
	}

	public void setCureNumber(Integer cureNumber) {
		this.cureNumber = cureNumber;
	}

	public Integer getFeesState() {
		return this.feesState;
	}

	public void setFeesState(Integer feesState) {
		this.feesState = feesState;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Set getTreatments() {
		return this.treatments;
	}

	public void setTreatments(Set treatments) {
		this.treatments = treatments;
	}

}