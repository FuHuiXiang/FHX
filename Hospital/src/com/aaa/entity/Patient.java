package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Patient entity. @author MyEclipse Persistence Tools
 */

public class Patient implements java.io.Serializable {

	// Fields

	private Integer pid;
	private Outhospital outhospital;
	private Stuff stuff;
	private Office office;
	private Inpatientarea inpatientarea;
	private String pname;
	private Long pcard;
	private Date pbirthday3;
	private String sex3;
	private Short page;
	private String pstatus;
	private String profession;
	private String birthplace;
	private String nation3;
	private String nationality;
	private String work;
	private String address3;
	private String phone3;
	private String zip;
	private String pemanentAddress;
	private String contactName;
	private String contactAddress;
	private String contactPhone;
	private Date pdate;
	private String presult;
	private Integer pstate;
	private Set outhospitals = new HashSet(0);
	private Set accountses = new HashSet(0);
	private Set advices = new HashSet(0);
	private Set relationship42s = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patient() {
	}

	/** full constructor */
	public Patient(Outhospital outhospital, Stuff stuff, Office office, Inpatientarea inpatientarea, String pname,
			Long pcard, Date pbirthday3, String sex3, Short page, String pstatus, String profession, String birthplace,
			String nation3, String nationality, String work, String address3, String phone3, String zip,
			String pemanentAddress, String contactName, String contactAddress, String contactPhone, Date pdate,
			String presult, Integer pstate, Set outhospitals, Set accountses, Set advices, Set relationship42s) {
		this.outhospital = outhospital;
		this.stuff = stuff;
		this.office = office;
		this.inpatientarea = inpatientarea;
		this.pname = pname;
		this.pcard = pcard;
		this.pbirthday3 = pbirthday3;
		this.sex3 = sex3;
		this.page = page;
		this.pstatus = pstatus;
		this.profession = profession;
		this.birthplace = birthplace;
		this.nation3 = nation3;
		this.nationality = nationality;
		this.work = work;
		this.address3 = address3;
		this.phone3 = phone3;
		this.zip = zip;
		this.pemanentAddress = pemanentAddress;
		this.contactName = contactName;
		this.contactAddress = contactAddress;
		this.contactPhone = contactPhone;
		this.pdate = pdate;
		this.presult = presult;
		this.pstate = pstate;
		this.outhospitals = outhospitals;
		this.accountses = accountses;
		this.advices = advices;
		this.relationship42s = relationship42s;
	}

	// Property accessors

	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	public Outhospital getOuthospital() {
		return this.outhospital;
	}

	public void setOuthospital(Outhospital outhospital) {
		this.outhospital = outhospital;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Inpatientarea getInpatientarea() {
		return this.inpatientarea;
	}

	public void setInpatientarea(Inpatientarea inpatientarea) {
		this.inpatientarea = inpatientarea;
	}

	public String getPname() {
		return this.pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getPcard() {
		return this.pcard;
	}

	public void setPcard(Long pcard) {
		this.pcard = pcard;
	}

	public Date getPbirthday3() {
		return this.pbirthday3;
	}

	public void setPbirthday3(Date pbirthday3) {
		this.pbirthday3 = pbirthday3;
	}

	public String getSex3() {
		return this.sex3;
	}

	public void setSex3(String sex3) {
		this.sex3 = sex3;
	}

	public Short getPage() {
		return this.page;
	}

	public void setPage(Short page) {
		this.page = page;
	}

	public String getPstatus() {
		return this.pstatus;
	}

	public void setPstatus(String pstatus) {
		this.pstatus = pstatus;
	}

	public String getProfession() {
		return this.profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getBirthplace() {
		return this.birthplace;
	}

	public void setBirthplace(String birthplace) {
		this.birthplace = birthplace;
	}

	public String getNation3() {
		return this.nation3;
	}

	public void setNation3(String nation3) {
		this.nation3 = nation3;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getWork() {
		return this.work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getAddress3() {
		return this.address3;
	}

	public void setAddress3(String address3) {
		this.address3 = address3;
	}

	public String getPhone3() {
		return this.phone3;
	}

	public void setPhone3(String phone3) {
		this.phone3 = phone3;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getPemanentAddress() {
		return this.pemanentAddress;
	}

	public void setPemanentAddress(String pemanentAddress) {
		this.pemanentAddress = pemanentAddress;
	}

	public String getContactName() {
		return this.contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactAddress() {
		return this.contactAddress;
	}

	public void setContactAddress(String contactAddress) {
		this.contactAddress = contactAddress;
	}

	public String getContactPhone() {
		return this.contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Date getPdate() {
		return this.pdate;
	}

	public void setPdate(Date pdate) {
		this.pdate = pdate;
	}

	public String getPresult() {
		return this.presult;
	}

	public void setPresult(String presult) {
		this.presult = presult;
	}

	public Integer getPstate() {
		return this.pstate;
	}

	public void setPstate(Integer pstate) {
		this.pstate = pstate;
	}

	public Set getOuthospitals() {
		return this.outhospitals;
	}

	public void setOuthospitals(Set outhospitals) {
		this.outhospitals = outhospitals;
	}

	public Set getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set accountses) {
		this.accountses = accountses;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

	public Set getRelationship42s() {
		return this.relationship42s;
	}

	public void setRelationship42s(Set relationship42s) {
		this.relationship42s = relationship42s;
	}

}