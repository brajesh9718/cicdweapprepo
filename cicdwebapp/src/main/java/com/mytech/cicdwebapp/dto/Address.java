package com.mytech.cicdwebapp.dto;

public class Address {

	int aid;
	String add;

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "Address [aid=" + aid + ", add=" + add + "]";
	}
}
