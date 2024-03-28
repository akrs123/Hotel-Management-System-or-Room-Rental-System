package com.entity;

public class Address {

	private String houseno;
	private String streetno;
	private int pincode;
	private String state;
	
	public Address(String houseno, String streetno, int pincode, String state) {
		this.houseno = houseno;
		this.streetno = streetno;
		this.pincode = pincode;
		this.state = state;
	}
	
	public String getHouseno() {
		return houseno;
	}
	public void setHouseno(String houseno) {
		this.houseno = houseno;
	}
	public String getStreetno() {
		return streetno;
	}
	public void setStreetno(String streetno) {
		this.streetno = streetno;
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [houseno:" + houseno + ", streetno:" + streetno
				+ ", pincode:" + pincode + ", state:" + state + "]";
	}
	
	
}
