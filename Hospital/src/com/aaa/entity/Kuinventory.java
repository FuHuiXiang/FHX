package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Kuinventory entity. @author MyEclipse Persistence Tools
 */

public class Kuinventory implements java.io.Serializable {

	// Fields

	private Integer rid2;
	private Ruku ruku;
	private Drug drug;
	private Integer totalNum4;
	private Set chukumings = new HashSet(0);
	private Set kubreakages = new HashSet(0);
	private Set drugstorages = new HashSet(0);

	// Constructors

	/** default constructor */
	public Kuinventory() {
	}

	/** full constructor */
	public Kuinventory(Ruku ruku, Drug drug, Integer totalNum4, Set chukumings, Set kubreakages, Set drugstorages) {
		this.ruku = ruku;
		this.drug = drug;
		this.totalNum4 = totalNum4;
		this.chukumings = chukumings;
		this.kubreakages = kubreakages;
		this.drugstorages = drugstorages;
	}

	// Property accessors

	public Integer getRid2() {
		return this.rid2;
	}

	public void setRid2(Integer rid2) {
		this.rid2 = rid2;
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

	public Integer getTotalNum4() {
		return this.totalNum4;
	}

	public void setTotalNum4(Integer totalNum4) {
		this.totalNum4 = totalNum4;
	}

	public Set getChukumings() {
		return this.chukumings;
	}

	public void setChukumings(Set chukumings) {
		this.chukumings = chukumings;
	}

	public Set getKubreakages() {
		return this.kubreakages;
	}

	public void setKubreakages(Set kubreakages) {
		this.kubreakages = kubreakages;
	}

	public Set getDrugstorages() {
		return this.drugstorages;
	}

	public void setDrugstorages(Set drugstorages) {
		this.drugstorages = drugstorages;
	}

}