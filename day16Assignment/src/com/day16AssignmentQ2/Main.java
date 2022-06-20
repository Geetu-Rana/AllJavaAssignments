package com.day16AssignmentQ2;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		TreeSet<Employee> e1 = new TreeSet<>();
		
		System.out.println("Please enter deatail here");
		
//		 e1.add(new Employee(20,"Amit",520));
//		 e1.add(new Employee(15,"Suresh",550));
//		 e1.add(new Employee(22,"Amit",540));
//		 e1.add(new Employee(18,"Rajesh",590));
		
		while(true) {
			System.out.println("Enter employee Id :");
			int id = sc.nextInt();
			
			System.out.println("Please enter Name");
			String name = sc.next();
			
			System.out.println("Enter Your Salary");
			double salary = sc.nextDouble();
			
			e1.add(new Employee(id,name,salary));
			
			System.out.println("Dou you want to add more employee enter y/n");
			String choice = sc.next();
			if(choice == "n")break;
		}
		
		System.out.println(e1);
		
	}
	
}
