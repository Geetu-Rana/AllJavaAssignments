package com.Assignmentday14Q2;

import java.util.Scanner;

public class UserRegistration {
	
	public String registerUser(String username, String userCountrey ) throws InvalidCountreyException {
		
		if(userCountrey.equalsIgnoreCase("India")) {
			return ("Usser registration done succesfully.");
		}else {
			InvalidCountreyException ice = new InvalidCountreyException("User Outside India cannot be registered");
			throw ice;
			
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Name : ");
		String name = sc.next();
		
		System.err.println("Enter Your Countrey : ");
		String countrey = sc.next();
		
		UserRegistration user = new UserRegistration();
		
		try {
			String result = user.registerUser(name, countrey) ;
			System.out.println(result);
			
		}catch(InvalidCountreyException ice) {
			System.out.println(ice.getMessage());
		}
		
		
	}
	
	

}
