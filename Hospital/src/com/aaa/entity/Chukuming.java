package com.aaa.entity;

/**
 * Chukuming entity. @author MyEclipse Persistence Tools
 */

public class Chukuming implements java.io.Serializable {

	// Fields

	private Integer ckmId;
	private Kuinventory kuinventory;
	private Chuku chuku;
	private Drug drug;
	private Integer num3;
	private Integer totalPrice5;

	// Constructors

	/** default constructor */
	public Chukuming() {
	}

	/** full constructor */
	public Chukuming(Kuinventory kuinventory, Chuku chuku, Drug drug, Integer num3, Integer totalPrice5) {
		this.kuinventory = kuinventory;
		this.chuku = chuku;
		this.drug = drug;
		this.num3 = num3;
		this.totalPrice5 = totalPrice5;
	}

	// Property accessors

	public Integer getCkmId() {
		return this.ckmId;
	}

	public void setCkmId(Integer ckmId) {
		this.ckmId = ckmId;
	}

	public Kuinventory getKuinventory() {
		return this.kuinventory;
	}

	public void setKuinventory(Kuinventory kuinventory) {
		this.kuinventory = kuinventory;
	}

	public Chuku getChuku() {
		return this.chuku;
	}

	public void setChuku(Chuku chuku) {
		this.chuku = chuku;
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

	public Integer getTotalPrice5() {
		return this.totalPrice5;
	}

	public void setTotalPrice5(Integer totalPrice5) {
		this.totalPrice5 = totalPrice5;
	}

}