package com.aaa.entity;

/**
 * Rukuming entity. @author MyEclipse Persistence Tools
 */

public class Rukuming implements java.io.Serializable {

	// Fields

	private Integer rid;
	private Ruku ruku;
	private Drug drug;
	private Integer num3;
	private Integer stockPrice3;
	private Integer totalPrice5;
	private String batchNum;

	// Constructors

	/** default constructor */
	public Rukuming() {
	}

	/** full constructor */
	public Rukuming(Ruku ruku, Drug drug, Integer num3, Integer stockPrice3, Integer totalPrice5, String batchNum) {
		this.ruku = ruku;
		this.drug = drug;
		this.num3 = num3;
		this.stockPrice3 = stockPrice3;
		this.totalPrice5 = totalPrice5;
		this.batchNum = batchNum;
	}

	// Property accessors

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Ruku getRuku() {
		return this.ruku;
	}

	public void setRuku(Ruku ruku) {
		this.ruku = ruku;
	}

	public Drug getDrug() {
		return this.drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Integer getNum3() {
		return this.num3;
	}

	public void setNum3(Integer num3) {
		this.num3 = num3;
	}

	public Integer getStockPrice3() {
		return this.stockPrice3;
	}

	public void setStockPrice3(Integer stockPrice3) {
		this.stockPrice3 = stockPrice3;
	}

	public Integer getTotalPrice5() {
		return this.totalPrice5;
	}

	public void setTotalPrice5(Integer totalPrice5) {
		this.totalPrice5 = totalPrice5;
	}

	public String getBatchNum() {
		return this.batchNum;
	}

	public void setBatchNum(String batchNum) {
		this.batchNum = batchNum;
	}

}