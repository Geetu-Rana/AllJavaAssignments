package com.day15Assignment2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class EmployeeBonus {

	public double bonus(String date)throws InvalidAgeException {
		LocalDate today = LocalDate.now();
		String dateFormat = "dd/MM/yyyy";
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(dateFormat);
		LocalDate inputdate = LocalDate.parse(date,dtf);
		Period diff = Period.between(inputdate,today);
		if(diff.getYears()<0) {
			if(diff.getYears()<1 && diff.getYears()>=0) {
				return 5000;
			}else if(diff.getYears()>=1 && diff.getYears()<2) {
				return 8000;
			}else if(diff.getYears()>=2) {
				return 10000;
			}else {
				InvalidAgeException iae = new InvalidAgeException("Please check the format");	
				throw iae;
			}
		}else {
			InvalidAgeException ina = new InvalidAgeException("Date can not be in future");
			throw ina;
		}
		
		
	}
	
}
