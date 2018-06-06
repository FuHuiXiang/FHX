package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Inspection entity. @author MyEclipse Persistence Tools
 */

public class Inspection implements java.io.Serializable {

	// Fields

	private Integer jyId;
	private Patients patients;
	private String checkPoint;
	private String maininfo;
	private String goal;
	private String state;
	private Set inspectionitems = new HashSet(0);
	private Set offices = new HashSet(0);

	// Constructors

	/** default constructor */
	public Inspection() {
	}

	/** full constructor */
	public Inspection(Patients patients, String checkPoint, String maininfo, String goal, String state,
			Set inspectionitems, Set offices) {
		this.patients = patients;
		this.checkPoint = checkPoint;
		this.maininfo = maininfo;
		this.goal = goal;
		this.state = state;
		this.inspectionitems = inspectionitems;
		this.offices = offices;
	}

	// Property accessors

	public Integer getJyId() {
		return this.jyId;
	}

	public void setJyId(Integer jyId) {
		this.jyId = jyId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public String getCheckPoint() {
		return this.checkPoint;
	}

	public void setCheckPoint(String checkPoint) {
		this.checkPoint = checkPoint;
	}

	public String getMaininfo() {
		return this.maininfo;
	}

	public void setMaininfo(String maininfo) {
		this.maininfo = maininfo;
	}

	public String getGoal() {
		return this.goal;
	}

	public void setGoal(String goal) {
		this.goal = goal;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Set getInspectionitems() {
		return this.inspectionitems;
	}

	public void setInspectionitems(Set inspectionitems) {
		this.inspectionitems = inspectionitems;
	}

	public Set getOffices() {
		return this.offices;
	}

	public void setOffices(Set offices) {
		this.offices = offices;
	}

}