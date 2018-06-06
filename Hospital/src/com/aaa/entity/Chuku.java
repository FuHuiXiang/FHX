package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Chuku entity. @author MyEclipse Persistence Tools
 */

public class Chuku implements java.io.Serializable {

	// Fields

	private Integer ckId;
	private Audit audit;
	private Drugstorage drugstorage;
	private Pharmacy pharmacy;
	private Date ckDate;
	private Set stuffs = new HashSet(0);
	private Set chukumings = new HashSet(0);

	// Constructors

	/** default constructor */
	public Chuku() {
	}

	/** full constructor */
	public Chuku(Audit audit, Drugstorage drugstorage, Pharmacy pharmacy, Date ckDate, Set stuffs, Set chukumings) {
		this.audit = audit;
		this.drugstorage = drugstorage;
		this.pharmacy = pharmacy;
		this.ckDate = ckDate;
		this.stuffs = stuffs;
		this.chukumings = chukumings;
	}

	// Property accessors

	public Integer getCkId() {
		return this.ckId;
	}

	public void setCkId(Integer ckId) {
		this.ckId = ckId;
	}

	public Audit getAudit() {
		return this.audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public Drugstorage getDrugstorage() {
		return this.drugstorage;
	}

	public void setDrugstorage(Drugstorage drugstorage) {
		this.drugstorage = drugstorage;
	}

	public Pharmacy getPharmacy() {
		return this.pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}

	public Date getCkDate() {
		return this.ckDate;
	}

	public void setCkDate(Date ckDate) {
		this.ckDate = ckDate;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

	public Set getChukumings() {
		return this.chukumings;
	}

	public void setChukumings(Set chukumings) {
		this.chukumings = chukumings;
	}

}