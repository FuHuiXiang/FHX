package com.aaa.entity;

/**
 * Treatment entity. @author MyEclipse Persistence Tools
 */

public class Treatment implements java.io.Serializable {

	// Fields

	private Integer id;
	private Cure cure;
	private String TName;
	private String monad;
	private Integer count;
	private Integer price;
	private Integer money;
	private String date;

	// Constructors

	/** default constructor */
	public Treatment() {
	}

	/** full constructor */
	public Treatment(Cure cure, String TName, String monad, Integer count, Integer price, Integer money, String date) {
		this.cure = cure;
		this.TName = TName;
		this.monad = monad;
		this.count = count;
		this.price = price;
		this.money = money;
		this.date = date;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Cure getCure() {
		return this.cure;
	}

	public void setCure(Cure cure) {
		this.cure = cure;
	}

	public String getTName() {
		return this.TName;
	}

	public void setTName(String TName) {
		this.TName = TName;
	}

	public String getMonad() {
		return this.monad;
	}

	public void setMonad(String monad) {
		this.monad = monad;
	}

	public Integer getCount() {
		return this.count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

	public Integer getPrice() {
		return this.price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getMoney() {
		return this.money;
	}

	public void setMoney(Integer money) {
		this.money = money;
	}

	public String getDate() {
		return this.date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}