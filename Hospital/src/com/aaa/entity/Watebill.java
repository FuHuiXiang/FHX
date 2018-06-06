package com.aaa.entity;

import java.util.Date;

/**
 * Watebill entity. @author MyEclipse Persistence Tools
 */

public class Watebill implements java.io.Serializable {

	// Fields

	private String billid;
	private Advice advice;
	private Accounts accounts;
	private Date billdate;
	private String billexecutor;
	private String billcondition;

	// Constructors

	/** default constructor */
	public Watebill() {
	}

	/** full constructor */
	public Watebill(Advice advice, Accounts accounts, Date billdate, String billexecutor, String billcondition) {
		this.advice = advice;
		this.accounts = accounts;
		this.billdate = billdate;
		this.billexecutor = billexecutor;
		this.billcondition = billcondition;
	}

	// Property accessors

	public String getBillid() {
		return this.billid;
	}

	public void setBillid(String billid) {
		this.billid = billid;
	}

	public Advice getAdvice() {
		return this.advice;
	}

	public void setAdvice(Advice advice) {
		this.advice = advice;
	}

	public Accounts getAccounts() {
		return this.accounts;
	}

	public void setAccounts(Accounts accounts) {
		this.accounts = accounts;
	}

	public Date getBilldate() {
		return this.billdate;
	}

	public void setBilldate(Date billdate) {
		this.billdate = billdate;
	}

	public String getBillexecutor() {
		return this.billexecutor;
	}

	public void setBillexecutor(String billexecutor) {
		this.billexecutor = billexecutor;
	}

	public String getBillcondition() {
		return this.billcondition;
	}

	public void setBillcondition(String billcondition) {
		this.billcondition = billcondition;
	}

}