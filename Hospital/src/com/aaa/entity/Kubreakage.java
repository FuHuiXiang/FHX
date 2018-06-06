package com.aaa.entity;

import java.util.Date;

/**
 * Kubreakage entity. @author MyEclipse Persistence Tools
 */

public class Kubreakage implements java.io.Serializable {

	// Fields

	private Integer bid2;
	private Kuinventory kuinventory;
	private Integer kbNum3;
	private String yuanYi3;
	private Date kbDate3;
	private Date sdate3;

	// Constructors

	/** default constructor */
	public Kubreakage() {
	}

	/** full constructor */
	public Kubreakage(Kuinventory kuinventory, Integer kbNum3, String yuanYi3, Date kbDate3, Date sdate3) {
		this.kuinventory = kuinventory;
		this.kbNum3 = kbNum3;
		this.yuanYi3 = yuanYi3;
		this.kbDate3 = kbDate3;
		this.sdate3 = sdate3;
	}

	// Property accessors

	public Integer getBid2() {
		return this.bid2;
	}

	public void setBid2(Integer bid2) {
		this.bid2 = bid2;
	}

	public Kuinventory getKuinventory() {
		return this.kuinventory;
	}

	public void setKuinventory(Kuinventory kuinventory) {
		this.kuinventory = kuinventory;
	}

	public Integer getKbNum3() {
		return this.kbNum3;
	}

	public void setKbNum3(Integer kbNum3) {
		this.kbNum3 = kbNum3;
	}

	public String getYuanYi3() {
		return this.yuanYi3;
	}

	public void setYuanYi3(String yuanYi3) {
		this.yuanYi3 = yuanYi3;
	}

	public Date getKbDate3() {
		return this.kbDate3;
	}

	public void setKbDate3(Date kbDate3) {
		this.kbDate3 = kbDate3;
	}

	public Date getSdate3() {
		return this.sdate3;
	}

	public void setSdate3(Date sdate3) {
		this.sdate3 = sdate3;
	}

}