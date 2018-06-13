package com.esoft.archer.user.model;

public class User {

	private String id;
	private String realname;
	private String mobile_number;

	public User() {
	}

	public User(String id, String realname, String mobile_number) {
		super();
		this.id = id;
		this.realname = realname;
		this.mobile_number = mobile_number;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRealname() {
		return realname;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public String getMobile_number() {
		return mobile_number;
	}

	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}

}
