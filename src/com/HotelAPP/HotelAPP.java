package com.HotelAPP;

import java.util.Scanner;
import com.service.HotelService;
import com.serviceImpln.HotelServiceImpln;
public class HotelAPP {

	public static void main(String[] args) {
		System.out.println("*=*=*=*=*=WELCOME TO TAJ HOTEL=*=*=*=*=*");
		Scanner sc=new Scanner(System.in);
		HotelService r1=new HotelServiceImpln();
		while(true) {
			System.out.println("=====HOMEPAGE=====");
			System.out.println("1.Info\n2.Rooms Available\n3.checkIn\n4.Costomer Details\n5.CheckOut\n6.Exit");
			System.out.println("!!!..Choose One Option To Proceed Booking..!!!");
			int op=sc.nextInt();
			switch (op) {
			case 1:r1.info();break;
			case 2:r1.roomsAvialable();break;
			case 3:r1.checkIn();break;
            case 4:r1.customerDetails();break;
            case 5:r1.checkOut();break;
			case 6:System.out.println("Thank You Visit Again..!!!");
			       System.exit(0);
			default:System.out.println("Invalid");
			}
		}
	}
}
