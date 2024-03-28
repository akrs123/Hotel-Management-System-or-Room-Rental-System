package com.serviceImpln;

import java.util.LinkedHashMap;
import java.util.Scanner;

import com.entity.Address;
import com.entity.Customer;
import com.service.HotelService;

public class HotelServiceImpln implements HotelService {
	 Scanner sc=new Scanner(System.in);

	{
		for(int i=101;i<=110;i++) {
			non_ac.put(i, null);
		}
		for(int i=201;i<=205;i++) {
			ac.put(i, null);
		}
		for(int i=301;i<=303;i++) {
			deluxe.put(i, null);
		}
	}
	
	@Override
	public void info() {
		System.out.println("=====Non-AC=====");
		System.out.println("************");
		System.out.println("*   Fan    *");
		System.out.println("*   Wifi   *");
		System.out.println("*   TV     *");
		System.out.println("* Rs.2000  *");
		System.out.println("* 2-Member *");
		System.out.println("************");
		System.out.println("=======AC=======");
		System.out.println("************");
		System.out.println("*    Ac    *");
		System.out.println("*   Wifi   *");
		System.out.println("*   TV     *");
		System.out.println("*  Rs.2500 *");
		System.out.println("* 2-Member *");
		System.out.println("************");
		System.out.println("=====Deluxe=====");
		System.out.println("**************");
		System.out.println("*     Ac     *");
		System.out.println("*    Wifi    *");
		System.out.println("*    TV      *");
		System.out.println("*  Rs.3000   *");
		System.out.println("*   Fridge   *");
		System.out.println("* 3-4 Member *");
		System.out.println("**************");
		
	}

	// we are checking the availability of rooms
	public void checkRooms(LinkedHashMap<Integer, Customer> m,String type) {
		
		System.out.println("=====:"+type+"Rooms:=====");
		int c=0;
		for(Integer roomno:m.keySet()) {
			if(m.get(roomno)==null) {
				System.out.print(roomno+" ");
				c++;
			}
		}
		System.out.println();
		if(c==0) {
			System.out.println("No Room Available...!!!");
		}
	}
	@Override
	public void roomsAvialable() {
		checkRooms(non_ac, "Non-Ac");
		checkRooms(ac,"Ac");
		checkRooms(deluxe,"Deluxe");
		
	}

	public void allocate(LinkedHashMap<Integer, Customer> m,String roomType,double roomPrice) {
		System.out.println("Enter the RoomNo:");
		int roomNo=sc.nextInt();
		if(m.containsKey(roomNo)&&m.get(roomNo)==null) {
			System.out.println("Enter Customer Id:-");
			int cusID=sc.nextInt();
			System.out.println("Enter Customer Name:-");
			String name=sc.next();
			System.out.println("Enter Customer PhoneNo:-");
			long phno=sc.nextLong();
			System.out.println("Enter Customer Age:-");
			int age=sc.nextInt();
			System.out.println("Enter Customer IdProof:-");
			boolean idProof=sc.nextBoolean();
			System.out.println("Enter Customer HouseNo:-");
			String houseno=sc.next();
			System.out.println("Enter Customer StreetNo:-");
			String streetno=sc.next();
			System.out.println("Enter Customer Pincode:-");
			int pincode=sc.nextInt();
			System.out.println("Enter Customer State:-");
			String state=sc.next();
			System.out.println("Enter Customer EmailId:-");
			String emailId=sc.next();
			Customer c=new Customer(cusID, name, phno, age, idProof,new Address(houseno, streetno, pincode, state) , roomType, 
					                 roomNo, roomPrice, emailId);
			m.put(roomNo, c);
			l1.add(c);
			System.out.println(c.getName()+" had been allocate for "+roomType+" roomno :"+roomNo);
			System.out.println(c.getName()+" need to pay Rs."+roomPrice);
		}
		else {
			System.out.println("Invalid Roomno:------");
		}
	}
	@Override
	public void checkIn() {
		
		System.out.println("========Check-In=======");
		System.out.println("1.Non-Ac\n2.Ac\n3.Deluxe");
		System.out.println("Enter the option:-");
		int op=sc.nextInt();
		switch(op) {
			case 1:allocate(non_ac, "Non-Ac", 2000);break;
			case 2:allocate(ac, "Ac", 2500);break;
			case 3:allocate(deluxe, "Deluxe", 3000);break;
			default:System.out.println("Invalid Option..!!!");
		}
	}

	void deAllocate(LinkedHashMap<Integer, Customer> m) {
		System.out.println("Enter the RoomNo:");
		int roomNo=sc.nextInt();
		if(m.containsKey(roomNo)&&m.get(roomNo)==null) {
			Customer c=m.get(roomNo);
			System.out.println(c.getName()+" Thanks For Visiting Our Hotel....!!!");
			m.put(roomNo, null);
		}
	}
	@Override
	public void checkOut() {
		System.out.println("========Check-Out=======");
		System.out.println("1.Non-Ac\n2.Ac\n3.Deluxe");
		System.out.println("Enter the option:-");
		int op=sc.nextInt();
		switch(op) {
			case 1:deAllocate(non_ac);break;
			case 2:deAllocate(ac);break;
			case 3:deAllocate(deluxe);break;
			default:System.out.println("Invalid Option..!!!");
		}
		
	}

	@Override
	public void customerDetails() {
		int c=0;
		System.out.println("======Customer Details=====");
		for(Customer ele:l1) {
			System.out.println(ele);
			c++;
		}
		if(c==0) {
			System.out.println("No Customer Data Found...!!!");
		}
	}
 
	

}






