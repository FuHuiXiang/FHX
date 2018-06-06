package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Patients entity. @author MyEclipse Persistence Tools
 */

public class Patients implements java.io.Serializable {

	// Fields

	private Integer id;
	private Patientdetail patientdetail;
	private Bookinginfo bookinginfo;
	private String patientname;
	private String sex;
	private Integer age;
	private String idnumber;
	private Set bookinginfos = new HashSet(0);
	private Set charges = new HashSet(0);
	private Set applicationresults = new HashSet(0);
	private Set clinicregisters = new HashSet(0);
	private Set inspections = new HashSet(0);
	private Set prescribes = new HashSet(0);
	private Set cures = new HashSet(0);
	private Set applicationforms = new HashSet(0);
	private Set medicalrecords = new HashSet(0);
	private Set iccards = new HashSet(0);
	private Set patientdetails = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patients() {
	}

	/** full constructor */
	public Patients(Patientdetail patientdetail, Bookinginfo bookinginfo, String patientname, String sex, Integer age,
			String idnumber, Set bookinginfos, Set charges, Set applicationresults, Set clinicregisters,
			Set inspections, Set prescribes, Set cures, Set applicationforms, Set medicalrecords, Set iccards,
			Set patientdetails) {
		this.patientdetail = patientdetail;
		this.bookinginfo = bookinginfo;
		this.patientname = patientname;
		this.sex = sex;
		this.age = age;
		this.idnumber = idnumber;
		this.bookinginfos = bookinginfos;
		this.charges = charges;
		this.applicationresults = applicationresults;
		this.clinicregisters = clinicregisters;
		this.inspections = inspections;
		this.prescribes = prescribes;
		this.cures = cures;
		this.applicationforms = applicationforms;
		this.medicalrecords = medicalrecords;
		this.iccards = iccards;
		this.patientdetails = patientdetails;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Patientdetail getPatientdetail() {
		return this.patientdetail;
	}

	public void setPatientdetail(Patientdetail patientdetail) {
		this.patientdetail = patientdetail;
	}

	public Bookinginfo getBookinginfo() {
		return this.bookinginfo;
	}

	public void setBookinginfo(Bookinginfo bookinginfo) {
		this.bookinginfo = bookinginfo;
	}

	public String getPatientname() {
		return this.patientname;
	}

	public void setPatientname(String patientname) {
		this.patientname = patientname;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getIdnumber() {
		return this.idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public Set getBookinginfos() {
		return this.bookinginfos;
	}

	public void setBookinginfos(Set bookinginfos) {
		this.bookinginfos = bookinginfos;
	}

	public Set getCharges() {
		return this.charges;
	}

	public void setCharges(Set charges) {
		this.charges = charges;
	}

	public Set getApplicationresults() {
		return this.applicationresults;
	}

	public void setApplicationresults(Set applicationresults) {
		this.applicationresults = applicationresults;
	}

	public Set getClinicregisters() {
		return this.clinicregisters;
	}

	public void setClinicregisters(Set clinicregisters) {
		this.clinicregisters = clinicregisters;
	}

	public Set getInspections() {
		return this.inspections;
	}

	public void setInspections(Set inspections) {
		this.inspections = inspections;
	}

	public Set getPrescribes() {
		return this.prescribes;
	}

	public void setPrescribes(Set prescribes) {
		this.prescribes = prescribes;
	}

	public Set getCures() {
		return this.cures;
	}

	public void setCures(Set cures) {
		this.cures = cures;
	}

	public Set getApplicationforms() {
		return this.applicationforms;
	}

	public void setApplicationforms(Set applicationforms) {
		this.applicationforms = applicationforms;
	}

	public Set getMedicalrecords() {
		return this.medicalrecords;
	}

	public void setMedicalrecords(Set medicalrecords) {
		this.medicalrecords = medicalrecords;
	}

	public Set getIccards() {
		return this.iccards;
	}

	public void setIccards(Set iccards) {
		this.iccards = iccards;
	}

	public Set getPatientdetails() {
		return this.patientdetails;
	}

	public void setPatientdetails(Set patientdetails) {
		this.patientdetails = patientdetails;
	}

}