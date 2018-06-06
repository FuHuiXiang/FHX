package com.aaa.entity;

/**
 * Lop entity. @author MyEclipse Persistence Tools
 */

public class Lop implements java.io.Serializable {

	// Fields

	private Integer lid;
	private Prescribe prescribe;
	private Drug drug;
	private String gg;
	private String dw;
	private Integer sl;
	private String dj;
	private String je;

	// Constructors

	/** default constructor */
	public Lop() {
	}

	/** full constructor */
	public Lop(Prescribe prescribe, Drug drug, String gg, String dw, Integer sl, String dj, String je) {
		this.prescribe = prescribe;
		this.drug = drug;
		this.gg = gg;
		this.dw = dw;
		this.sl = sl;
		this.dj = dj;
		this.je = je;
	}

	// Property accessors

	public Integer getLid() {
		return this.lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public Prescribe getPrescribe() {
		return this.prescribe;
	}

	public void setPrescribe(Prescribe prescribe) {
		this.prescribe = prescribe;
	}

	public Drug getDrug() {
		return this.drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public String getGg() {
		return this.gg;
	}

	public void setGg(String gg) {
		this.gg = gg;
	}

	public String getDw() {
		return this.dw;
	}

	public void setDw(String dw) {
		this.dw = dw;
	}

	public Integer getSl() {
		return this.sl;
	}

	public void setSl(Integer sl) {
		this.sl = sl;
	}

	public String getDj() {
		return this.dj;
	}

	public void setDj(String dj) {
		this.dj = dj;
	}

	public String getJe() {
		return this.je;
	}

	public void setJe(String je) {
		this.je = je;
	}

}