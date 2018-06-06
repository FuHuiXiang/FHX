package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Advice entity. @author MyEclipse Persistence Tools
 */

public class Advice implements java.io.Serializable {

	// Fields

	private Integer adviceid;
	private Patient patient;
	private Yzmoid yzmoid;
	private Stuff stuff;
	private Date beginTime;
	private Date outtime;
	private Double totalprice3;
	private String context;
	private Integer adstate;
	private Set watebills = new HashSet(0);
	private Set adviceinfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Advice() {
	}

	/** full constructor */
	public Advice(Patient patient, Yzmoid yzmoid, Stuff stuff, Date beginTime, Date outtime, Double totalprice3,
			String context, Integer adstate, Set watebills, Set adviceinfos) {
		this.patient = patient;
		this.yzmoid = yzmoid;
		this.stuff = stuff;
		this.beginTime = beginTime;
		this.outtime = outtime;
		this.totalprice3 = totalprice3;
		this.context = context;
		this.adstate = adstate;
		this.watebills = watebills;
		this.adviceinfos = adviceinfos;
	}

	// Property accessors

	public Integer getAdviceid() {
		return this.adviceid;
	}

	public void setAdviceid(Integer adviceid) {
		this.adviceid = adviceid;
	}

	public Patient getPatient() {
		return this.patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Yzmoid getYzmoid() {
		return this.yzmoid;
	}

	public void setYzmoid(Yzmoid yzmoid) {
		this.yzmoid = yzmoid;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}

	public Date getOuttime() {
		return this.outtime;
	}

	public void setOuttime(Date outtime) {
		this.outtime = outtime;
	}

	public Double getTotalprice3() {
		return this.totalprice3;
	}

	public void setTotalprice3(Double totalprice3) {
		this.totalprice3 = totalprice3;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

	public Integer getAdstate() {
		return this.adstate;
	}

	public void setAdstate(Integer adstate) {
		this.adstate = adstate;
	}

	public Set getWatebills() {
		return this.watebills;
	}

	public void setWatebills(Set watebills) {
		this.watebills = watebills;
	}

	public Set getAdviceinfos() {
		return this.adviceinfos;
	}

	public void setAdviceinfos(Set adviceinfos) {
		this.adviceinfos = adviceinfos;
	}

}