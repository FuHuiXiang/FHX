package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Inpatientarea entity. @author MyEclipse Persistence Tools
 */

public class Inpatientarea implements java.io.Serializable {

	// Fields

	private Integer bqid;
	private Bqtype bqtype;
	private String bqname;
	private String bqaddress;
	private String bqstate;
	private String bqremark;
	private Set beds = new HashSet(0);
	private Set patients = new HashSet(0);

	// Constructors

	/** default constructor */
	public Inpatientarea() {
	}

	/** full constructor */
	public Inpatientarea(Bqtype bqtype, String bqname, String bqaddress, String bqstate, String bqremark, Set beds,
			Set patients) {
		this.bqtype = bqtype;
		this.bqname = bqname;
		this.bqaddress = bqaddress;
		this.bqstate = bqstate;
		this.bqremark = bqremark;
		this.beds = beds;
		this.patients = patients;
	}

	// Property accessors

	public Integer getBqid() {
		return this.bqid;
	}

	public void setBqid(Integer bqid) {
		this.bqid = bqid;
	}

	public Bqtype getBqtype() {
		return this.bqtype;
	}

	public void setBqtype(Bqtype bqtype) {
		this.bqtype = bqtype;
	}

	public String getBqname() {
		return this.bqname;
	}

	public void setBqname(String bqname) {
		this.bqname = bqname;
	}

	public String getBqaddress() {
		return this.bqaddress;
	}

	public void setBqaddress(String bqaddress) {
		this.bqaddress = bqaddress;
	}

	public String getBqstate() {
		return this.bqstate;
	}

	public void setBqstate(String bqstate) {
		this.bqstate = bqstate;
	}

	public String getBqremark() {
		return this.bqremark;
	}

	public void setBqremark(String bqremark) {
		this.bqremark = bqremark;
	}

	public Set getBeds() {
		return this.beds;
	}

	public void setBeds(Set beds) {
		this.beds = beds;
	}

	public Set getPatients() {
		return this.patients;
	}

	public void setPatients(Set patients) {
		this.patients = patients;
	}

}