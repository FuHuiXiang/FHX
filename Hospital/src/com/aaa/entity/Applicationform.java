package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Applicationform entity. @author MyEclipse Persistence Tools
 */

public class Applicationform implements java.io.Serializable {

	// Fields

	private Integer jcId;
	private Patients patients;
	private String checkPoint;
	private String mainInfo;
	private String goal;
	private String state;
	private Set applicationitems = new HashSet(0);
	private Set offices = new HashSet(0);

	// Constructors

	/** default constructor */
	public Applicationform() {
	}

	/** full constructor */
	public Applicationform(Patients patients, String checkPoint, String mainInfo, String goal, String state,
			Set applicationitems, Set offices) {
		this.patients = patients;
		this.checkPoint = checkPoint;
		this.mainInfo = mainInfo;
		this.goal = goal;
		this.state = state;
		this.applicationitems = applicationitems;
		this.offices = offices;
	}

	// Property accessors

	public Integer getJcId() {
		return this.jcId;
	}

	public void setJcId(Integer jcId) {
		this.jcId = jcId;
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

	public String getMainInfo() {
		return this.mainInfo;
	}

	public void setMainInfo(String mainInfo) {
		this.mainInfo = mainInfo;
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

	public Set getApplicationitems() {
		return this.applicationitems;
	}

	public void setApplicationitems(Set applicationitems) {
		this.applicationitems = applicationitems;
	}

	public Set getOffices() {
		return this.offices;
	}

	public void setOffices(Set offices) {
		this.offices = offices;
	}

}