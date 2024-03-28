package com.entity;

public class Customer {

	private int cusID;
	private String name;
	private long phno;
	private int age;
	private boolean IdProof;
	private Address address;
	private String roomType;
	private int roomNo;
	private double roomPrice;
	private String emailId;
	
	
	public Customer(int cusID, String name, long phno, int age, boolean idProof, Address address, String roomType,
			int roomNo, double roomPrice, String emailId) {
		
		this.cusID = cusID;
		this.name = name;
		this.phno = phno;
		this.age = age;
		IdProof = idProof;
		this.address = address;
		this.setRoomType(roomType);
		this.setRoomNo(roomNo);
		this.setRoomPrice(roomPrice);
		this.emailId = emailId;
	}
	public int getCusID() {
		return cusID;
	}
	public void setCusID(int cusID) {
		this.cusID = cusID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isIdProof() {
		return IdProof;
	}
	public void setIdProof(boolean idProof) {
		IdProof = idProof;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public int getRoomNo() {
		return roomNo;
	}
	public void setRoomNo(int roomNo) {
		this.roomNo = roomNo;
	}
	public double getRoomPrice() {
		return roomPrice;
	}
	public void setRoomPrice(double roomPrice) {
		this.roomPrice = roomPrice;
	}
	@Override
	public String toString() {
		return "Customer [cusID=" + cusID + ", name=" + name + ", phno=" + phno + ", age=" + age + ", IdProof="
				+ IdProof + ", address=" + address + ", roomType=" + roomType + ", roomNo=" + roomNo + ", roomPrice="
				+ roomPrice + ", emailId=" + emailId + "]";
	}
	
	
}
