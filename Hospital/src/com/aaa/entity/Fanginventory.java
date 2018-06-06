package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Fanginventory entity. @author MyEclipse Persistence Tools
 */

public class Fanginventory implements java.io.Serializable {

	// Fields

	private Integer fiId;
	private Drug drug;
	private Integer totalNum4;
	private Set breakages = new HashSet(0);
	private Set pharmacies = new HashSet(0);

	// Constructors

	/** default constructor */
	public Fanginventory() {
	}

	/** full constructor */
	public Fanginventory(Drug drug, Integer totalNum4, Set breakages, Set pharmacies) {
		this.drug = drug;
		this.totalNum4 = totalNum4;
		this.breakages = breakages;
		this.pharmacies = pharmacies;
	}

	// Property accessors

	public Integer getFiId() {
		return this.fiId;
	}

	public void setFiId(Integer fiId) {
		this.fiId = fiId;
	}

	public Drug getDrug() {
		return this.drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Integer getTotalNum4() {
		return this.totalNum4;
	}

	public void setTotalNum4(Integer totalNum4) {
		this.totalNum4 = totalNum4;
	}

	public Set getBreakages() {
		return this.breakages;
	}

	public void setBreakages(Set breakages) {
		this.breakages = breakages;
	}

	public Set getPharmacies() {
		return this.pharmacies;
	}

	public void setPharmacies(Set pharmacies) {
		this.pharmacies = pharmacies;
	}

}