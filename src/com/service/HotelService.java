package com.service;

import java.util.ArrayList;
import java.util.LinkedHashMap;

import com.entity.Customer;

public interface HotelService {

	ArrayList<Customer> l1=new  ArrayList<Customer>();
	LinkedHashMap<Integer, Customer> non_ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> ac=new LinkedHashMap<Integer, Customer>();
	LinkedHashMap<Integer, Customer> deluxe=new LinkedHashMap<Integer, Customer>();
	
	void info();
	void roomsAvialable();
	void checkIn();
	void checkOut();
	void customerDetails();
	//find customerbyID......
}
