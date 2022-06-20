package com.day15assignmentQ1;

import java.sql.Time;
import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
	
	public static void func(String date) {
		
		
		LocalDate today = LocalDate.now();
		String dateFormat = "dd/MM/yyyy";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		 
		LocalDate inputDate = LocalDate.parse(date,dtf);
		
		
		if(inputDate.equals(today)) {
			System.out.println("Today is the first Day");
		}else if(inputDate.isBefore(today)) {
			Period diff =Period.between(today, inputDate);  
			System.out.print("Years"+diff.getYears());
			System.out.print("Month"+diff.getMonths());
			System.out.println("Days"+diff.getDays());
		}else{
			System.out.println("Date is in future. Please try again!");
		};	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Age : ");
		String dob = sc.next();
		try {
		func(dob);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	
}
