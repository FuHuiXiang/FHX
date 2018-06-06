package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Pharmacy entity. @author MyEclipse Persistence Tools
 */

public class Pharmacy implements java.io.Serializable {

	// Fields

	private Integer phId;
	private Fanginventory fanginventory;
	private String phName;
	private String address5;
	private Set stuffs = new HashSet(0);
	private Set prescribes = new HashSet(0);
	private Set chukus = new HashSet(0);

	// Constructors

	/** default constructor */
	public Pharmacy() {
	}

	/** full constructor */
	public Pharmacy(Fanginventory fanginventory, String phName, String address5, Set stuffs, Set prescribes,
			Set chukus) {
		this.fanginventory = fanginventory;
		this.phName = phName;
		this.address5 = address5;
		this.stuffs = stuffs;
		this.prescribes = prescribes;
		this.chukus = chukus;
	}

	// Property accessors

	public Integer getPhId() {
		return this.phId;
	}

	public void setPhId(Integer phId) {
		this.phId = phId;
	}

	public Fanginventory getFanginventory() {
		return this.fanginventory;
	}

	public void setFanginventory(Fanginventory fanginventory) {
		this.fanginventory = fanginventory;
	}

	public String getPhName() {
		return this.phName;
	}

	public void setPhName(String phName) {
		this.phName = phName;
	}

	public String getAddress5() {
		return this.address5;
	}

	public void setAddress5(String address5) {
		this.address5 = address5;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

	public Set getPrescribes() {
		return this.prescribes;
	}

	public void setPrescribes(Set prescribes) {
		this.prescribes = prescribes;
	}

	public Set getChukus() {
		return this.chukus;
	}

	public void setChukus(Set chukus) {
		this.chukus = chukus;
	}

}