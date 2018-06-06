package com.aaa.entity;

/**
 * Adjustprice entity. @author MyEclipse Persistence Tools
 */

public class Adjustprice implements java.io.Serializable {

	// Fields

	private Integer apId;
	private Drug drug;
	private Integer tradePrice3;
	private Integer retailPrice3;

	// Constructors

	/** default constructor */
	public Adjustprice() {
	}

	/** full constructor */
	public Adjustprice(Drug drug, Integer tradePrice3, Integer retailPrice3) {
		this.drug = drug;
		this.tradePrice3 = tradePrice3;
		this.retailPrice3 = retailPrice3;
	}

	// Property accessors

	public Integer getApId() {
		return this.apId;
	}

	public void setApId(Integer apId) {
		this.apId = apId;
	}

	public Drug getDrug() {
		return this.drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Integer getTradePrice3() {
		return this.tradePrice3;
	}

	public void setTradePrice3(Integer tradePrice3) {
		this.tradePrice3 = tradePrice3;
	}

	public Integer getRetailPrice3() {
		return this.retailPrice3;
	}

	public void setRetailPrice3(Integer retailPrice3) {
		this.retailPrice3 = retailPrice3;
	}

}