package com.aaa.entity;

import java.util.HashSet;
import java.util.Set;

/**
 * Usertable entity. @author MyEclipse Persistence Tools
 */

public class Usertable implements java.io.Serializable {

	// Fields

	private Integer userId;
	private Stuff stuff;
	private Rolestable rolestable;
	private String userName;
	private String password;
	private String question;
	private String answer;
	private Set stuffs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Usertable() {
	}

	/** full constructor */
	public Usertable(Stuff stuff, Rolestable rolestable, String userName, String password, String question,
			String answer, Set stuffs) {
		this.stuff = stuff;
		this.rolestable = rolestable;
		this.userName = userName;
		this.password = password;
		this.question = question;
		this.answer = answer;
		this.stuffs = stuffs;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Stuff getStuff() {
		return this.stuff;
	}

	public void setStuff(Stuff stuff) {
		this.stuff = stuff;
	}

	public Rolestable getRolestable() {
		return this.rolestable;
	}

	public void setRolestable(Rolestable rolestable) {
		this.rolestable = rolestable;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public String getAnswer() {
		return this.answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Set getStuffs() {
		return this.stuffs;
	}

	public void setStuffs(Set stuffs) {
		this.stuffs = stuffs;
	}

}