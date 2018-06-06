package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Charge entity. @author MyEclipse Persistence Tools
 */

public class Charge implements java.io.Serializable {

	// Fields

	private Integer sfId;
	private Patients patients;
	private Integer sftId;
	private String fessName;
	private Integer charge;
	private Integer chargeable;
	private Integer realCharge;
	private Integer changes;
	private Set particularses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Charge() {
	}

	/** full constructor */
	public Charge(Patients patients, Integer sftId, String fessName, Integer charge, Integer chargeable,
			Integer realCharge, Integer changes, Set particularses) {
		this.patients = patients;
		this.sftId = sftId;
		this.fessName = fessName;
		this.charge = charge;
		this.chargeable = chargeable;
		this.realCharge = realCharge;
		this.changes = changes;
		this.particularses = particularses;
	}

	// Property accessors

	public Integer getSfId() {
		return this.sfId;
	}

	public void setSfId(Integer sfId) {
		this.sfId = sfId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public Integer getSftId() {
		return this.sftId;
	}

	public void setSftId(Integer sftId) {
		this.sftId = sftId;
	}

	public String getFessName() {
		return this.fessName;
	}

	public void setFessName(String fessName) {
		this.fessName = fessName;
	}

	public Integer getCharge() {
		return this.charge;
	}

	public void setCharge(Integer charge) {
		this.charge = charge;
	}

	public Integer getChargeable() {
		return this.chargeable;
	}

	public void setChargeable(Integer chargeable) {
		this.chargeable = chargeable;
	}

	public Integer getRealCharge() {
		return this.realCharge;
	}

	public void setRealCharge(Integer realCharge) {
		this.realCharge = realCharge;
	}

	public Integer getChanges() {
		return this.changes;
	}

	public void setChanges(Integer changes) {
		this.changes = changes;
	}

	public Set getParticularses() {
		return this.particularses;
	}

	public void setParticularses(Set particularses) {
		this.particularses = particularses;
	}

}