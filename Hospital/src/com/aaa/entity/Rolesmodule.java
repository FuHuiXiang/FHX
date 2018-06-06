package com.aaa.entity;

/**
 * Rolesmodule entity. @author MyEclipse Persistence Tools
 */

public class Rolesmodule implements java.io.Serializable {

	// Fields

	private Integer rmId;
	private Modules modules;
	private Rolestable rolestable;

	// Constructors

	/** default constructor */
	public Rolesmodule() {
	}

	/** full constructor */
	public Rolesmodule(Modules modules, Rolestable rolestable) {
		this.modules = modules;
		this.rolestable = rolestable;
	}

	// Property accessors

	public Integer getRmId() {
		return this.rmId;
	}

	public void setRmId(Integer rmId) {
		this.rmId = rmId;
	}

	public Modules getModules() {
		return this.modules;
	}

	public void setModules(Modules modules) {
		this.modules = modules;
	}

	public Rolestable getRolestable() {
		return this.rolestable;
	}

	public void setRolestable(Rolestable rolestable) {
		this.rolestable = rolestable;
	}

}