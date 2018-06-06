package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Drug entity. @author MyEclipse Persistence Tools
 */

public class Drug implements java.io.Serializable {

	// Fields

	private Integer did;
	private Address address;
	private Pharmacology pharmacology;
	private Dosageform dosageform;
	private Doseunit doseunit;
	private Drugtype2 drugtype2;
	private String dname;
	private String zhuji;
	private String spec;
	private Integer dosage2;
	private Integer huansuan;
	private Integer maxNum;
	private Integer minNum;
	private Integer stockPrice;
	private Integer tradePrice;
	private Integer retaiPrice;
	private Set rukumings = new HashSet(0);
	private Set fanginventories = new HashSet(0);
	private Set kuinventories = new HashSet(0);
	private Set adjustprices = new HashSet(0);
	private Set chukumings = new HashSet(0);
	private Set lops = new HashSet(0);

	// Constructors

	/** default constructor */
	public Drug() {
	}

	/** full constructor */
	public Drug(Address address, Pharmacology pharmacology, Dosageform dosageform, Doseunit doseunit,
			Drugtype2 drugtype2, String dname, String zhuji, String spec, Integer dosage2, Integer huansuan,
			Integer maxNum, Integer minNum, Integer stockPrice, Integer tradePrice, Integer retaiPrice, Set rukumings,
			Set fanginventories, Set kuinventories, Set adjustprices, Set chukumings, Set lops) {
		this.address = address;
		this.pharmacology = pharmacology;
		this.dosageform = dosageform;
		this.doseunit = doseunit;
		this.drugtype2 = drugtype2;
		this.dname = dname;
		this.zhuji = zhuji;
		this.spec = spec;
		this.dosage2 = dosage2;
		this.huansuan = huansuan;
		this.maxNum = maxNum;
		this.minNum = minNum;
		this.stockPrice = stockPrice;
		this.tradePrice = tradePrice;
		this.retaiPrice = retaiPrice;
		this.rukumings = rukumings;
		this.fanginventories = fanginventories;
		this.kuinventories = kuinventories;
		this.adjustprices = adjustprices;
		this.chukumings = chukumings;
		this.lops = lops;
	}

	// Property accessors

	public Integer getDid() {
		return this.did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Address getAddress() {
		return this.address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Pharmacology getPharmacology() {
		return this.pharmacology;
	}

	public void setPharmacology(Pharmacology pharmacology) {
		this.pharmacology = pharmacology;
	}

	public Dosageform getDosageform() {
		return this.dosageform;
	}

	public void setDosageform(Dosageform dosageform) {
		this.dosageform = dosageform;
	}

	public Doseunit getDoseunit() {
		return this.doseunit;
	}

	public void setDoseunit(Doseunit doseunit) {
		this.doseunit = doseunit;
	}

	public Drugtype2 getDrugtype2() {
		return this.drugtype2;
	}

	public void setDrugtype2(Drugtype2 drugtype2) {
		this.drugtype2 = drugtype2;
	}

	public String getDname() {
		return this.dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getZhuji() {
		return this.zhuji;
	}

	public void setZhuji(String zhuji) {
		this.zhuji = zhuji;
	}

	public String getSpec() {
		return this.spec;
	}

	public void setSpec(String spec) {
		this.spec = spec;
	}

	public Integer getDosage2() {
		return this.dosage2;
	}

	public void setDosage2(Integer dosage2) {
		this.dosage2 = dosage2;
	}

	public Integer getHuansuan() {
		return this.huansuan;
	}

	public void setHuansuan(Integer huansuan) {
		this.huansuan = huansuan;
	}

	public Integer getMaxNum() {
		return this.maxNum;
	}

	public void setMaxNum(Integer maxNum) {
		this.maxNum = maxNum;
	}

	public Integer getMinNum() {
		return this.minNum;
	}

	public void setMinNum(Integer minNum) {
		this.minNum = minNum;
	}

	public Integer getStockPrice() {
		return this.stockPrice;
	}

	public void setStockPrice(Integer stockPrice) {
		this.stockPrice = stockPrice;
	}

	public Integer getTradePrice() {
		return this.tradePrice;
	}

	public void setTradePrice(Integer tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Integer getRetaiPrice() {
		return this.retaiPrice;
	}

	public void setRetaiPrice(Integer retaiPrice) {
		this.retaiPrice = retaiPrice;
	}

	public Set getRukumings() {
		return this.rukumings;
	}

	public void setRukumings(Set rukumings) {
		this.rukumings = rukumings;
	}

	public Set getFanginventories() {
		return this.fanginventories;
	}

	public void setFanginventories(Set fanginventories) {
		this.fanginventories = fanginventories;
	}

	public Set getKuinventories() {
		return this.kuinventories;
	}

	public void setKuinventories(Set kuinventories) {
		this.kuinventories = kuinventories;
	}

	public Set getAdjustprices() {
		return this.adjustprices;
	}

	public void setAdjustprices(Set adjustprices) {
		this.adjustprices = adjustprices;
	}

	public Set getChukumings() {
		return this.chukumings;
	}

	public void setChukumings(Set chukumings) {
		this.chukumings = chukumings;
	}

	public Set getLops() {
		return this.lops;
	}

	public void setLops(Set lops) {
		this.lops = lops;
	}

}