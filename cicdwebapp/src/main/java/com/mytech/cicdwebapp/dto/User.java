package com.mytech.cicdwebapp.dto;

import org.springframework.beans.factory.annotation.Autowired;

public class User {
	private int uid;
	private String username;
	@Autowired
	private Address address;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
}
