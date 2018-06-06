package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Patientdetail entity. @author MyEclipse Persistence Tools
 */

public class Patientdetail implements java.io.Serializable {

	// Fields

	private Integer patientId;
	private Patients patients;
	private String patientType;
	private Integer phone;
	private String nation;
	private String marry;
	private String blood;
	private String job;
	private String homeAddress;
	private String workAddress;
	private String sources;
	private String allergic;
	private Integer medicalRecord;
	private Set patientses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patientdetail() {
	}

	/** full constructor */
	public Patientdetail(Patients patients, String patientType, Integer phone, String nation, String marry,
			String blood, String job, String homeAddress, String workAddress, String sources, String allergic,
			Integer medicalRecord, Set patientses) {
		this.patients = patients;
		this.patientType = patientType;
		this.phone = phone;
		this.nation = nation;
		this.marry = marry;
		this.blood = blood;
		this.job = job;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
		this.sources = sources;
		this.allergic = allergic;
		this.medicalRecord = medicalRecord;
		this.patientses = patientses;
	}

	// Property accessors

	public Integer getPatientId() {
		return this.patientId;
	}

	public void setPatientId(Integer patientId) {
		this.patientId = patientId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public String getPatientType() {
		return this.patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public Integer getPhone() {
		return this.phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public String getMarry() {
		return this.marry;
	}

	public void setMarry(String marry) {
		this.marry = marry;
	}

	public String getBlood() {
		return this.blood;
	}

	public void setBlood(String blood) {
		this.blood = blood;
	}

	public String getJob() {
		return this.job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public String getHomeAddress() {
		return this.homeAddress;
	}

	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}

	public String getWorkAddress() {
		return this.workAddress;
	}

	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}

	public String getSources() {
		return this.sources;
	}

	public void setSources(String sources) {
		this.sources = sources;
	}

	public String getAllergic() {
		return this.allergic;
	}

	public void setAllergic(String allergic) {
		this.allergic = allergic;
	}

	public Integer getMedicalRecord() {
		return this.medicalRecord;
	}

	public void setMedicalRecord(Integer medicalRecord) {
		this.medicalRecord = medicalRecord;
	}

	public Set getPatientses() {
		return this.patientses;
	}

	public void setPatientses(Set patientses) {
		this.patientses = patientses;
	}

}