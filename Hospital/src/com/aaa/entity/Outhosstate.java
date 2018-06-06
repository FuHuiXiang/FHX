package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Outhosstate entity. @author MyEclipse Persistence Tools
 */

public class Outhosstate implements java.io.Serializable {

	// Fields

	private Integer patientstateid;
	private Outhospital outhospital;
	private Integer patientstate;
	private String nowsymptoms;
	private String recorder;
	private Date recordingtime;
	private Set outhospitals = new HashSet(0);

	// Constructors

	/** default constructor */
	public Outhosstate() {
	}

	/** full constructor */
	public Outhosstate(Outhospital outhospital, Integer patientstate, String nowsymptoms, String recorder,
			Date recordingtime, Set outhospitals) {
		this.outhospital = outhospital;
		this.patientstate = patientstate;
		this.nowsymptoms = nowsymptoms;
		this.recorder = recorder;
		this.recordingtime = recordingtime;
		this.outhospitals = outhospitals;
	}

	// Property accessors

	public Integer getPatientstateid() {
		return this.patientstateid;
	}

	public void setPatientstateid(Integer patientstateid) {
		this.patientstateid = patientstateid;
	}

	public Outhospital getOuthospital() {
		return this.outhospital;
	}

	public void setOuthospital(Outhospital outhospital) {
		this.outhospital = outhospital;
	}

	public Integer getPatientstate() {
		return this.patientstate;
	}

	public void setPatientstate(Integer patientstate) {
		this.patientstate = patientstate;
	}

	public String getNowsymptoms() {
		return this.nowsymptoms;
	}

	public void setNowsymptoms(String nowsymptoms) {
		this.nowsymptoms = nowsymptoms;
	}

	public String getRecorder() {
		return this.recorder;
	}

	public void setRecorder(String recorder) {
		this.recorder = recorder;
	}

	public Date getRecordingtime() {
		return this.recordingtime;
	}

	public void setRecordingtime(Date recordingtime) {
		this.recordingtime = recordingtime;
	}

	public Set getOuthospitals() {
		return this.outhospitals;
	}

	public void setOuthospitals(Set outhospitals) {
		this.outhospitals = outhospitals;
	}

}