package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Bed entity. @author MyEclipse Persistence Tools
 */

public class Bed implements java.io.Serializable {

	// Fields

	private Integer bedno;
	private Stuff stuff;
	private Inpatientarea inpatientarea;
	private Integer bedstate;
	private String bedrank;
	private Set relationship42s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Bed() {
	}

	/** full constructor */
	public Bed(Stuff stuff, Inpatientarea inpatientarea, Integer bedstate, String bedrank, Set relationship42s) {
		this.stuff = stuff;
		this.inpatientarea = inpatientarea;
		this.bedstate = bedstate;
		this.bedrank = bedrank;
		this.relationship42s = relationship42s;
	}

	// Property accessors

	public Integer getBedno() {
		return this.bedno;
	}

	public void setBedno(Integer bedno) {
		this.bedno = bedno;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Inpatientarea getInpatientarea() {
		return this.inpatientarea;
	}

	public void setInpatientarea(Inpatientarea inpatientarea) {
		this.inpatientarea = inpatientarea;
	}

	public Integer getBedstate() {
		return this.bedstate;
	}

	public void setBedstate(Integer bedstate) {
		this.bedstate = bedstate;
	}

	public String getBedrank() {
		return this.bedrank;
	}

	public void setBedrank(String bedrank) {
		this.bedrank = bedrank;
	}

	public Set getRelationship42s() {
		return this.relationship42s;
	}

	public void setRelationship42s(Set relationship42s) {
		this.relationship42s = relationship42s;
	}

}