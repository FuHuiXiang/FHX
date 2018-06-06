package com.aaa.entity;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Stuff entity. @author MyEclipse Persistence Tools
 */

public class Stuff implements java.io.Serializable {

	// Fields

	private Integer stuffid2;
	private Jobtitle jobtitle;
	private Position position;
	private Scheduleitem scheduleitem;
	private Chuku chuku;
	private Office office;
	private Stufftype stufftype;
	private Clinicregister clinicregister;
	private Drugstorage drugstorage;
	private Pharmacy pharmacy;
	private Usertable usertable;
	private String stuffname;
	private String sex3;
	private String idcard;
	private String address3;
	private String phone3;
	private Date hiredate;
	private Date pbirthday3;
	private String nation3;
	private String cardNo;
	private String nativePlace;
	private String politics;
	private String photo;
	private Integer roomstate;
	private Set outhospitals = new HashSet(0);
	private Set advices = new HashSet(0);
	private Set usertables = new HashSet(0);
	private Set beds = new HashSet(0);
	private Set patients = new HashSet(0);

	// Constructors

	/** default constructor */
	public Stuff() {
	}

	/** full constructor */
	public Stuff(Jobtitle jobtitle, Position position, Scheduleitem scheduleitem, Chuku chuku, Office office,
			Stufftype stufftype, Clinicregister clinicregister, Drugstorage drugstorage, Pharmacy pharmacy,
			Usertable usertable, String stuffname, String sex3, String idcard, String address3, String phone3,
			Date hiredate, Date pbirthday3, String nation3, String cardNo, String nativePlace, String politics,
			String photo, Integer roomstate, Set outhospitals, Set advices, Set usertables, Set beds, Set patients) {
		this.jobtitle = jobtitle;
		this.position = position;
		this.scheduleitem = scheduleitem;
		this.chuku = chuku;
		this.office = office;
		this.stufftype = stufftype;
		this.clinicregister = clinicregister;
		this.drugstorage = drugstorage;
		this.pharmacy = pharmacy;
		this.usertable = usertable;
		this.stuffname = stuffname;
		this.sex3 = sex3;
		this.idcard = idcard;
		this.address3 = address3;
		this.phone3 = phone3;
		this.hiredate = hiredate;
		this.pbirthday3 = pbirthday3;
		this.nation3 = nation3;
		this.cardNo = cardNo;
		this.nativePlace = nativePlace;
		this.politics = politics;
		this.photo = photo;
		this.roomstate = roomstate;
		this.outhospitals = outhospitals;
		this.advices = advices;
		this.usertables = usertables;
		this.beds = beds;
		this.patients = patients;
	}

	// Property accessors

	public Integer getStuffid2() {
		return this.stuffid2;
	}

	public void setStuffid2(Integer stuffid2) {
		this.stuffid2 = stuffid2;
	}

	public Jobtitle getJobtitle() {
		return this.jobtitle;
	}

	public void setJobtitle(Jobtitle jobtitle) {
		this.jobtitle = jobtitle;
	}

	public Position getPosition() {
		return this.position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public Scheduleitem getScheduleitem() {
		return this.scheduleitem;
	}

	public void setScheduleitem(Scheduleitem scheduleitem) {
		this.scheduleitem = scheduleitem;
	}

	public Chuku getChuku() {
		return this.chuku;
	}

	public void setChuku(Chuku chuku) {
		this.chuku = chuku;
	}

	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public Stufftype getStufftype() {
		return this.stufftype;
	}

	public void setStufftype(Stufftype stufftype) {
		this.stufftype = stufftype;
	}

	public Clinicregister getClinicregister() {
		return this.clinicregister;
	}

	public void setClinicregister(Clinicregister clinicregister) {
		this.clinicregister = clinicregister;
	}

	public Drugstorage getDrugstorage() {
		return this.drugstorage;
	}

	public void setDrugstorage(Drugstorage drugstorage) {
		this.drugstorage = drugstorage;
	}

	public Pharmacy getPharmacy() {
		return this.pharmacy;
	}

	public void setPharmacy(Pharmacy pharmacy) {
		this.pharmacy = pharmacy;
	}

	public Usertable getUsertable() {
		return this.usertable;
	}

	public void setUsertable(Usertable usertable) {
		this.usertable = usertable;
	}

	public String getStuffname() {
		return this.stuffname;
	}

	public void setStuffname(String stuffname) {
		this.stuffname = stuffname;
	}

	public String getSex3() {
		return this.sex3;
	}

	public void setSex3(String sex3) {
		this.sex3 = sex3;
	}

	public String getIdcard() {
		return this.idcard;
	}

	public void setIdcard(String idcard) {
		this.idcard = idcard;
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

	public Date getHiredate() {
		return this.hiredate;
	}

	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}

	public Date getPbirthday3() {
		return this.pbirthday3;
	}

	public void setPbirthday3(Date pbirthday3) {
		this.pbirthday3 = pbirthday3;
	}

	public String getNation3() {
		return this.nation3;
	}

	public void setNation3(String nation3) {
		this.nation3 = nation3;
	}

	public String getCardNo() {
		return this.cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public String getNativePlace() {
		return this.nativePlace;
	}

	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}

	public String getPolitics() {
		return this.politics;
	}

	public void setPolitics(String politics) {
		this.politics = politics;
	}

	public String getPhoto() {
		return this.photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Integer getRoomstate() {
		return this.roomstate;
	}

	public void setRoomstate(Integer roomstate) {
		this.roomstate = roomstate;
	}

	public Set getOuthospitals() {
		return this.outhospitals;
	}

	public void setOuthospitals(Set outhospitals) {
		this.outhospitals = outhospitals;
	}

	public Set getAdvices() {
		return this.advices;
	}

	public void setAdvices(Set advices) {
		this.advices = advices;
	}

	public Set getUsertables() {
		return this.usertables;
	}

	public void setUsertables(Set usertables) {
		this.usertables = usertables;
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