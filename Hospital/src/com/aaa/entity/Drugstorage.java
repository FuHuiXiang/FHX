package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Drugstorage entity. @author MyEclipse Persistence Tools
 */

public class Drugstorage implements java.io.Serializable {

	// Fields

	private Integer dsId;
	private Kuinventory kuinventory;
	private String dsName;
	private Integer address5;
	private Set stuffs = new HashSet(0);
	private Set chukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Drugstorage() {
	}

	/** minimal constructor */
	public Drugstorage(Integer address5) {
		this.address5 = address5;
	}

	/** full constructor */
	public Drugstorage(Kuinventory kuinventory, String dsName, Integer address5, Set stuffs, Set chukus) {
		this.kuinventory = kuinventory;
		this.dsName = dsName;
		this.address5 = address5;
		this.stuffs = stuffs;
		this.chukus = chukus;
	}

	// Property accessors

	public Integer getDsId() {
		return this.dsId;
	}

	public void setDsId(Integer dsId) {
		this.dsId = dsId;
	}

	public Kuinventory getKuinventory() {
		return this.kuinventory;
	}

	public void setKuinventory(Kuinventory kuinventory) {
		this.kuinventory = kuinventory;
	}

	public String getDsName() {
		return this.dsName;
	}

	public void setDsName(String dsName) {
		this.dsName = dsName;
	}

	public Integer getAddress5() {
		return this.address5;
	}

	public void setAddress5(Integer address5) {
		this.address5 = address5;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

	public Set getChukus() {
		return this.chukus;
	}

	public void setChukus(Set chukus) {
		this.chukus = chukus;
	}

}