package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Scheduleitem entity. @author MyEclipse Persistence Tools
 */

public class Scheduleitem implements java.io.Serializable {

	// Fields

	private Integer id;
	private Scheduletype scheduletype;
	private Schedule schedule;
	private Set stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Scheduleitem() {
	}

	/** full constructor */
	public Scheduleitem(Scheduletype scheduletype, Schedule schedule, Set stuffs) {
		this.scheduletype = scheduletype;
		this.schedule = schedule;
		this.stuffs = stuffs;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Scheduletype getScheduletype() {
		return this.scheduletype;
	}

	public void setScheduletype(Scheduletype scheduletype) {
		this.scheduletype = scheduletype;
	}

	public Schedule getSchedule() {
		return this.schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

}