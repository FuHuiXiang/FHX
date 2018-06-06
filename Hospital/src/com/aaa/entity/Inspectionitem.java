package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Inspectionitem entity. @author MyEclipse Persistence Tools
 */

public class Inspectionitem implements java.io.Serializable {

	// Fields

	private Integer jyxId;
	private Inspection inspection;
	private String name;
	private Integer price;
	private String info;
	private Set applicationresults = new HashSet(0);

	// Constructors

	/** default constructor */
	public Inspectionitem() {
	}

	/** full constructor */
	public Inspectionitem(Inspection inspection, String name, Integer price, String info, Set applicationresults) {
		this.inspection = inspection;
		this.name = name;
		this.price = price;
		this.info = info;
		this.applicationresults = applicationresults;
	}

	// Property accessors

	public Integer getJyxId() {
		return this.jyxId;
	}

	public void setJyxId(Integer jyxId) {
		this.jyxId = jyxId;
	}

	public Inspection getInspection() {
		return this.inspection;
	}

	public void setInspection(Inspection inspection) {
		this.inspection = inspection;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Set getApplicationresults() {
		return this.applicationresults;
	}

	public void setApplicationresults(Set applicationresults) {
		this.applicationresults = applicationresults;
	}

}