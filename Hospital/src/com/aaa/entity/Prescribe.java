package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Prescribe entity. @author MyEclipse Persistence Tools
 */

public class Prescribe implements java.io.Serializable {

	// Fields

	private Integer chinesePrescribeId;
	private Patients patients;
	private Pharmacy pharmacy;
	private String tcmname;
	private String guige;
	private Integer shuliang;
	private Integer danjia;
	private Integer money;
	private String stuffId;
	private Date prescribeTime5;
	private Set chinesedetailses = new HashSet(0);
	private Set drugtypes = new HashSet(0);
	private Set lops = new HashSet(0);

	// Constructors

	/** default constructor */
	public Prescribe() {
	}

	/** full constructor */
	public Prescribe(Patients patients, Pharmacy pharmacy, String tcmname, String guige, Integer shuliang,
			Integer danjia, Integer money, String stuffId, Date prescribeTime5, Set chinesedetailses, Set drugtypes,
			Set lops) {
		this.patients = patients;
		this.pharmacy = pharmacy;
		this.tcmname = tcmname;
		this.guige = guige;
		this.shuliang = shuliang;
		this.danjia = danjia;
		this.money = money;
		this.stuffId = stuffId;
		this.prescribeTime5 = prescribeTime5;
		this.chinesedetailses = chinesedetailses;
		this.drugtypes = drugtypes;
		this.lops = lops;
	}

	// Property accessors

	public Integer getChinesePrescribeId() {
		return this.chinesePrescribeId;
	}

	public void setChinesePrescribeId(Integer chinesePrescribeId) {
		this.chinesePrescribeId = chinesePrescribeId;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public Pharmacy getPharmacy() {
		return this.pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}

	public String getTcmname() {
		return this.tcmname;
	}

	public void setTcmname(String tcmname) {
		this.tcmname = tcmname;
	}

	public String getGuige() {
		return this.guige;
	}

	public void setGuige(String guige) {
		this.guige = guige;
	}

	public Integer getShuliang() {
		return this.shuliang;
	}

	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}

	public Integer getDanjia() {
		return this.danjia;
	}

	public void setDanjia(Integer danjia) {
		this.danjia = danjia;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getStuffId() {
		return this.stuffId;
	}

	public void setStuffId(String stuffId) {
		this.stuffId = stuffId;
	}

	public Date getPrescribeTime5() {
		return this.prescribeTime5;
	}

	public void setPrescribeTime5(Date prescribeTime5) {
		this.prescribeTime5 = prescribeTime5;
	}

	public Set getChinesedetailses() {
		return this.chinesedetailses;
	}

	public void setChinesedetailses(Set chinesedetailses) {
		this.chinesedetailses = chinesedetailses;
	}

	public Set getDrugtypes() {
		return this.drugtypes;
	}

	public void setDrugtypes(Set drugtypes) {
		this.drugtypes = drugtypes;
	}

	public Set getLops() {
		return this.lops;
	}

	public void setLops(Set lops) {
		this.lops = lops;
	}

}