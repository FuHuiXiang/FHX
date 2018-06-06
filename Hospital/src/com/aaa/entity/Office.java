package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Office entity. @author MyEclipse Persistence Tools
 */

public class Office implements java.io.Serializable {

	// Fields

	private Integer officeId;
	private Inspection inspection;
	private Bookinginfo bookinginfo;
	private Applicationform applicationform;
	private Clinicregister clinicregister;
	private String officeName;
	private Integer officePhone;
	private String intro;
	private Date foundTime;
	private String mainperson;
	private String comment;
	private Set stuffs = new HashSet(0);
	private Set departmenttypes = new HashSet(0);
	private Set patients = new HashSet(0);

	// Constructors

	/** default constructor */
	public Office() {
	}

	/** full constructor */
	public Office(Inspection inspection, Bookinginfo bookinginfo, Applicationform applicationform,
			Clinicregister clinicregister, String officeName, Integer officePhone, String intro, Date foundTime,
			String mainperson, String comment, Set stuffs, Set departmenttypes, Set patients) {
		this.inspection = inspection;
		this.bookinginfo = bookinginfo;
		this.applicationform = applicationform;
		this.clinicregister = clinicregister;
		this.officeName = officeName;
		this.officePhone = officePhone;
		this.intro = intro;
		this.foundTime = foundTime;
		this.mainperson = mainperson;
		this.comment = comment;
		this.stuffs = stuffs;
		this.departmenttypes = departmenttypes;
		this.patients = patients;
	}

	// Property accessors

	public Integer getOfficeId() {
		return this.officeId;
	}

	public void setOfficeId(Integer officeId) {
		this.officeId = officeId;
	}

	public Inspection getInspection() {
		return this.inspection;
	}

	public void setInspection(Inspection inspection) {
		this.inspection = inspection;
	}

	public Bookinginfo getBookinginfo() {
		return this.bookinginfo;
	}

	public void setBookinginfo(Bookinginfo bookinginfo) {
		this.bookinginfo = bookinginfo;
	}

	public Applicationform getApplicationform() {
		return this.applicationform;
	}

	public void setApplicationform(Applicationform applicationform) {
		this.applicationform = applicationform;
	}

	public Clinicregister getClinicregister() {
		return this.clinicregister;
	}

	public void setClinicregister(Clinicregister clinicregister) {
		this.clinicregister = clinicregister;
	}

	public String getOfficeName() {
		return this.officeName;
	}

	public void setOfficeName(String officeName) {
		this.officeName = officeName;
	}

	public Integer getOfficePhone() {
		return this.officePhone;
	}

	public void setOfficePhone(Integer officePhone) {
		this.officePhone = officePhone;
	}

	public String getIntro() {
		return this.intro;
	}

	public void setIntro(String intro) {
		this.intro = intro;
	}

	public Date getFoundTime() {
		return this.foundTime;
	}

	public void setFoundTime(Date foundTime) {
		this.foundTime = foundTime;
	}

	public String getMainperson() {
		return this.mainperson;
	}

	public void setMainperson(String mainperson) {
		this.mainperson = mainperson;
	}

	public String getComment() {
		return this.comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

	public Set getDepartmenttypes() {
		return this.departmenttypes;
	}

	public void setDepartmenttypes(Set departmenttypes) {
		this.departmenttypes = departmenttypes;
	}

	public Set getPatients() {
		return this.patients;
	}

	public void setPatients(Set patients) {
		this.patients = patients;
	}

}