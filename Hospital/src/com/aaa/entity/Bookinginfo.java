package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Bookinginfo entity. @author MyEclipse Persistence Tools
 */

public class Bookinginfo implements java.io.Serializable {

	// Fields

	private Integer bookingInfoId;
	private Patients patients;
	private Iccard iccard;
	private String diagnosisType;
	private String time;
	private String description;
	private String upload;
	private Set offices = new HashSet(0);
	private Set patientses = new HashSet(0);
	private Set iccards = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bookinginfo() {
	}

	/** full constructor */
	public Bookinginfo(Patients patients, Iccard iccard, String diagnosisType, String time, String description,
			String upload, Set offices, Set patientses, Set iccards) {
		this.patients = patients;
		this.iccard = iccard;
		this.diagnosisType = diagnosisType;
		this.time = time;
		this.description = description;
		this.upload = upload;
		this.offices = offices;
		this.patientses = patientses;
		this.iccards = iccards;
	}

	// Property accessors

	public Integer getBookingInfoId() {
		return this.bookingInfoId;
	}

	public void setBookingInfoId(Integer bookingInfoId) {
		this.bookingInfoId = bookingInfoId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public Iccard getIccard() {
		return this.iccard;
	}

	public void setIccard(Iccard iccard) {
		this.iccard = iccard;
	}

	public String getDiagnosisType() {
		return this.diagnosisType;
	}

	public void setDiagnosisType(String diagnosisType) {
		this.diagnosisType = diagnosisType;
	}

	public String getTime() {
		return this.time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUpload() {
		return this.upload;
	}

	public void setUpload(String upload) {
		this.upload = upload;
	}

	public Set getOffices() {
		return this.offices;
	}

	public void setOffices(Set offices) {
		this.offices = offices;
	}

	public Set getPatientses() {
		return this.patientses;
	}

	public void setPatientses(Set patientses) {
		this.patientses = patientses;
	}

	public Set getIccards() {
		return this.iccards;
	}

	public void setIccards(Set iccards) {
		this.iccards = iccards;
	}

}