package com.aaa.entity;

/**
 * Departmenttype entity. @author MyEclipse Persistence Tools
 */

public class Departmenttype implements java.io.Serializable {

	// Fields

	private String departmentTypeid;
	private Office office;
	private String genre;
	private String mainperson3;
	private String location;
	private String departmentName3;

	// Constructors

	/** default constructor */
	public Departmenttype() {
	}

	/** full constructor */
	public Departmenttype(Office office, String genre, String mainperson3, String location, String departmentName3) {
		this.office = office;
		this.genre = genre;
		this.mainperson3 = mainperson3;
		this.location = location;
		this.departmentName3 = departmentName3;
	}

	// Property accessors

	public String getDepartmentTypeid() {
		return this.departmentTypeid;
	}

	public void setDepartmentTypeid(String departmentTypeid) {
		this.departmentTypeid = departmentTypeid;
	}

	public Office getOffice() {
		return this.office;
	}

	public void setOffice(Office office) {
		this.office = office;
	}

	public String getGenre() {
		return this.genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getMainperson3() {
		return this.mainperson3;
	}

	public void setMainperson3(String mainperson3) {
		this.mainperson3 = mainperson3;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDepartmentName3() {
		return this.departmentName3;
	}

	public void setDepartmentName3(String departmentName3) {
		this.departmentName3 = departmentName3;
	}

}