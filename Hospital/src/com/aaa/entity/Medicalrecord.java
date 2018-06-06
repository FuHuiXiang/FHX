package com.aaa.entity;

import java.util.Date;

/**
 * Medicalrecord entity. @author MyEclipse Persistence Tools
 */

public class Medicalrecord implements java.io.Serializable {

	// Fields

	private Integer medicalRecordId;
	private Patients patients;
	private String zhushu;
	private String bingshi;
	private String guomins;
	private String jiazhus;
	private String tizheng;
	private String xianbins;
	private String chuli;
	private String curesuggest;
	private Date visitTime3;

	// Constructors

	/** default constructor */
	public Medicalrecord() {
	}

	/** full constructor */
	public Medicalrecord(Patients patients, String zhushu, String bingshi, String guomins, String jiazhus,
			String tizheng, String xianbins, String chuli, String curesuggest, Date visitTime3) {
		this.patients = patients;
		this.zhushu = zhushu;
		this.bingshi = bingshi;
		this.guomins = guomins;
		this.jiazhus = jiazhus;
		this.tizheng = tizheng;
		this.xianbins = xianbins;
		this.chuli = chuli;
		this.curesuggest = curesuggest;
		this.visitTime3 = visitTime3;
	}

	// Property accessors

	public Integer getMedicalRecordId() {
		return this.medicalRecordId;
	}

	public void setMedicalRecordId(Integer medicalRecordId) {
		this.medicalRecordId = medicalRecordId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public String getZhushu() {
		return this.zhushu;
	}

	public void setZhushu(String zhushu) {
		this.zhushu = zhushu;
	}

	public String getBingshi() {
		return this.bingshi;
	}

	public void setBingshi(String bingshi) {
		this.bingshi = bingshi;
	}

	public String getGuomins() {
		return this.guomins;
	}

	public void setGuomins(String guomins) {
		this.guomins = guomins;
	}

	public String getJiazhus() {
		return this.jiazhus;
	}

	public void setJiazhus(String jiazhus) {
		this.jiazhus = jiazhus;
	}

	public String getTizheng() {
		return this.tizheng;
	}

	public void setTizheng(String tizheng) {
		this.tizheng = tizheng;
	}

	public String getXianbins() {
		return this.xianbins;
	}

	public void setXianbins(String xianbins) {
		this.xianbins = xianbins;
	}

	public String getChuli() {
		return this.chuli;
	}

	public void setChuli(String chuli) {
		this.chuli = chuli;
	}

	public String getCuresuggest() {
		return this.curesuggest;
	}

	public void setCuresuggest(String curesuggest) {
		this.curesuggest = curesuggest;
	}

	public Date getVisitTime3() {
		return this.visitTime3;
	}

	public void setVisitTime3(Date visitTime3) {
		this.visitTime3 = visitTime3;
	}

}