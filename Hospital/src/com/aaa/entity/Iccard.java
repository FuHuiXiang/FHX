package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Iccard entity. @author MyEclipse Persistence Tools
 */

public class Iccard implements java.io.Serializable {

	// Fields

	private Integer icid;
	private Bookinginfo bookinginfo;
	private Patients patients;
	private String name;
	private Integer money;
	private String iphone;
	private Set bookinginfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Iccard() {
	}

	/** minimal constructor */
	public Iccard(Patients patients) {
		this.patients = patients;
	}

	/** full constructor */
	public Iccard(Bookinginfo bookinginfo, Patients patients, String name, Integer money, String iphone,
			Set bookinginfos) {
		this.bookinginfo = bookinginfo;
		this.patients = patients;
		this.name = name;
		this.money = money;
		this.iphone = iphone;
		this.bookinginfos = bookinginfos;
	}

	// Property accessors

	public Integer getIcid() {
		return this.icid;
	}

	public void setIcid(Integer icid) {
		this.icid = icid;
	}

	public Bookinginfo getBookinginfo() {
		return this.bookinginfo;
	}

	public void setBookinginfo(Bookinginfo bookinginfo) {
		this.bookinginfo = bookinginfo;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getIphone() {
		return this.iphone;
	}

	public void setIphone(String iphone) {
		this.iphone = iphone;
	}

	public Set getBookinginfos() {
		return this.bookinginfos;
	}

	public void setBookinginfos(Set bookinginfos) {
		this.bookinginfos = bookinginfos;
	}

}