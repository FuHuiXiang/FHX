package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Ruku entity. @author MyEclipse Persistence Tools
 */

public class Ruku implements java.io.Serializable {

	// Fields

	private Integer yid;
	private Paymensstatus paymensstatus;
	private Supplier supplier;
	private Date scDate;
	private Integer totalNum4;
	private Integer totalPrice5;
	private Date yxDate;
	private Set kuinventories = new HashSet(0);
	private Set rukumings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Ruku() {
	}

	/** full constructor */
	public Ruku(Paymensstatus paymensstatus, Supplier supplier, Date scDate, Integer totalNum4, Integer totalPrice5,
			Date yxDate, Set kuinventories, Set rukumings) {
		this.paymensstatus = paymensstatus;
		this.supplier = supplier;
		this.scDate = scDate;
		this.totalNum4 = totalNum4;
		this.totalPrice5 = totalPrice5;
		this.yxDate = yxDate;
		this.kuinventories = kuinventories;
		this.rukumings = rukumings;
	}

	// Property accessors

	public Integer getYid() {
		return this.yid;
	}

	public void setYid(Integer yid) {
		this.yid = yid;
	}

	public Paymensstatus getPaymensstatus() {
		return this.paymensstatus;
	}

	public void setPaymensstatus(Paymensstatus paymensstatus) {
		this.paymensstatus = paymensstatus;
	}

	public Supplier getSupplier() {
		return this.supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Date getScDate() {
		return this.scDate;
	}

	public void setScDate(Date scDate) {
		this.scDate = scDate;
	}

	public Integer getTotalNum4() {
		return this.totalNum4;
	}

	public void setTotalNum4(Integer totalNum4) {
		this.totalNum4 = totalNum4;
	}

	public Integer getTotalPrice5() {
		return this.totalPrice5;
	}

	public void setTotalPrice5(Integer totalPrice5) {
		this.totalPrice5 = totalPrice5;
	}

	public Date getYxDate() {
		return this.yxDate;
	}

	public void setYxDate(Date yxDate) {
		this.yxDate = yxDate;
	}

	public Set getKuinventories() {
		return this.kuinventories;
	}

	public void setKuinventories(Set kuinventories) {
		this.kuinventories = kuinventories;
	}

	public Set getRukumings() {
		return this.rukumings;
	}

	public void setRukumings(Set rukumings) {
		this.rukumings = rukumings;
	}

}