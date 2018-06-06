package com.aaa.entity;

import java.util.Date;

/**
 * Particulars entity. @author MyEclipse Persistence Tools
 */

public class Particulars implements java.io.Serializable {

	// Fields

	private Integer fessId;
	private Charge charge;
	private String fessName;
	private Integer deposithandlersid;
	private String payer;
	private Date billingdate;
	private String type;
	private Integer fessNum;
	private String fessExplain;
	private Integer tollSum;
	private String addr;
	private String accounts;

	// Constructors

	/** default constructor */
	public Particulars() {
	}

	/** full constructor */
	public Particulars(Charge charge, String fessName, Integer deposithandlersid, String payer, Date billingdate,
			String type, Integer fessNum, String fessExplain, Integer tollSum, String addr, String accounts) {
		this.charge = charge;
		this.fessName = fessName;
		this.deposithandlersid = deposithandlersid;
		this.payer = payer;
		this.billingdate = billingdate;
		this.type = type;
		this.fessNum = fessNum;
		this.fessExplain = fessExplain;
		this.tollSum = tollSum;
		this.addr = addr;
		this.accounts = accounts;
	}

	// Property accessors

	public Integer getFessId() {
		return this.fessId;
	}

	public void setFessId(Integer fessId) {
		this.fessId = fessId;
	}

	public Charge getCharge() {
		return this.charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}

	public String getFessName() {
		return this.fessName;
	}

	public void setFessName(String fessName) {
		this.fessName = fessName;
	}

	public Integer getDeposithandlersid() {
		return this.deposithandlersid;
	}

	public void setDeposithandlersid(Integer deposithandlersid) {
		this.deposithandlersid = deposithandlersid;
	}

	public String getPayer() {
		return this.payer;
	}

	public void setPayer(String payer) {
		this.payer = payer;
	}

	public Date getBillingdate() {
		return this.billingdate;
	}

	public void setBillingdate(Date billingdate) {
		this.billingdate = billingdate;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Integer getFessNum() {
		return this.fessNum;
	}

	public void setFessNum(Integer fessNum) {
		this.fessNum = fessNum;
	}

	public String getFessExplain() {
		return this.fessExplain;
	}

	public void setFessExplain(String fessExplain) {
		this.fessExplain = fessExplain;
	}

	public Integer getTollSum() {
		return this.tollSum;
	}

	public void setTollSum(Integer tollSum) {
		this.tollSum = tollSum;
	}

	public String getAddr() {
		return this.addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getAccounts() {
		return this.accounts;
	}

	public void setAccounts(String accounts) {
		this.accounts = accounts;
	}

}