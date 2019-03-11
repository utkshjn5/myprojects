package com.app.user;

public class UserDetails {
	private String name;
	private String gender;
	private String mob;
	public UserDetails(String name, String gender, String mob) {
		super();
		this.name = name;
		this.gender = gender;
		this.mob = mob;
	}
	public UserDetails() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMob() {
		return mob;
	}
	public void setMob(String mob) {
		this.mob = mob;
	}
	

}
