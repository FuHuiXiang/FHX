package com.aaa.entity;

/**
 * Chinesedetails entity. @author MyEclipse Persistence Tools
 */

public class Chinesedetails implements java.io.Serializable {

	// Fields

	private Integer chineseDetailsId;
	private Prescribe prescribe;
	private String dose;
	private String unit;
	private String explains;
	private String usages;
	private String frequency;
	private String days;
	private String drugId;

	// Constructors

	/** default constructor */
	public Chinesedetails() {
	}

	/** full constructor */
	public Chinesedetails(Prescribe prescribe, String dose, String unit, String explains, String usages,
			String frequency, String days, String drugId) {
		this.prescribe = prescribe;
		this.dose = dose;
		this.unit = unit;
		this.explains = explains;
		this.usages = usages;
		this.frequency = frequency;
		this.days = days;
		this.drugId = drugId;
	}

	// Property accessors

	public Integer getChineseDetailsId() {
		return this.chineseDetailsId;
	}

	public void setChineseDetailsId(Integer chineseDetailsId) {
		this.chineseDetailsId = chineseDetailsId;
	}

	public Prescribe getPrescribe() {
		return this.prescribe;
	}

	public void setPrescribe(Prescribe prescribe) {
		this.prescribe = prescribe;
	}

	public String getDose() {
		return this.dose;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getExplains() {
		return this.explains;
	}

	public void setExplains(String explains) {
		this.explains = explains;
	}

	public String getUsages() {
		return this.usages;
	}

	public void setUsages(String usages) {
		this.usages = usages;
	}

	public String getFrequency() {
		return this.frequency;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getDays() {
		return this.days;
	}

	public void setDays(String days) {
		this.days = days;
	}

	public String getDrugId() {
		return this.drugId;
	}

	public void setDrugId(String drugId) {
		this.drugId = drugId;
	}

}