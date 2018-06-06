package com.aaa.entity;

/**
 * Applicationresult entity. @author MyEclipse Persistence Tools
 */

public class Applicationresult implements java.io.Serializable {

	// Fields

	private Integer jcjId;
	private Inspectionitem inspectionitem;
	private Applicationitem applicationitem;
	private Patients patients;
	private String inspectionitem_1;
	private String result;
	private String reference;
	private String unit;

	// Constructors

	/** default constructor */
	public Applicationresult() {
	}

	/** full constructor */
	public Applicationresult(Inspectionitem inspectionitem, Applicationitem applicationitem, Patients patients,
			String inspectionitem_1, String result, String reference, String unit) {
		this.inspectionitem = inspectionitem;
		this.applicationitem = applicationitem;
		this.patients = patients;
		this.inspectionitem_1 = inspectionitem_1;
		this.result = result;
		this.reference = reference;
		this.unit = unit;
	}

	// Property accessors

	public Integer getJcjId() {
		return this.jcjId;
	}

	public void setJcjId(Integer jcjId) {
		this.jcjId = jcjId;
	}

	public Inspectionitem getInspectionitem() {
		return this.inspectionitem;
	}

	public void setInspectionitem(Inspectionitem inspectionitem) {
		this.inspectionitem = inspectionitem;
	}

	public Applicationitem getApplicationitem() {
		return this.applicationitem;
	}

	public void setApplicationitem(Applicationitem applicationitem) {
		this.applicationitem = applicationitem;
	}

	public Patients getPatients() {
		return this.patients;
	}

	public void setPatients(Patients patients) {
		this.patients = patients;
	}

	public String getInspectionitem_1() {
		return this.inspectionitem_1;
	}

	public void setInspectionitem_1(String inspectionitem_1) {
		this.inspectionitem_1 = inspectionitem_1;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getReference() {
		return this.reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

}