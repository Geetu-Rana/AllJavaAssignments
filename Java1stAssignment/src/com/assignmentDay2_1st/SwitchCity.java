package com.assignmentDay2_1st;

public class SwitchCity {
		
	public static void main(String[] args) {
		
		String city = "Himnachal" ;
		
		switch(city) {
		case "Delhi":
			System.out.println("Capital of the country");
			break;
		case "Kolkata":
			System.out.println("City of Joy");
			break;
		case "Mumbai":
			System.out.println("Financial city");
			break;
		case "Bangalore":
			System.out.println("Cyber City");
			break;
		default:
			System.out.println("May be Other Indian City");
		break;
		}
	}
}
