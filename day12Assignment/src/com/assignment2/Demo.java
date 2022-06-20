package com.assignment2;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.regex.Matcher;


public class Demo {
	public boolean validate(String name, String mobileNum, String aadhaCard) {
		String regName = "^[A-Z]{3,9}$";
		String regAadhar = "^[0-9]{12}";
		String mobileNumb = "^[0-9]{10}";
		
		Pattern regAdhar = Pattern.compile(regAadhar);
		Pattern pattren = Pattern.compile(regName);
		Pattern regMob = Pattern.compile(mobileNumb);
		
		
		Matcher name1 = pattren.matcher(name);
		Matcher mobnum = regMob.matcher(mobileNum);
		Matcher aadhar = regAdhar.matcher(aadhaCard);
		if(name1.matches()==true && mobnum.matches()==true && aadhar.matches()==true)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	};
	public static void main(String[] args) {
		
		Citizen c1 = new Citizen();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Name ");
		String Name = sc.next();
		c1.setName(Name);
		
		System.out.println("Enter Addhar ");
		
		String Aadhar = sc.next();
		c1.setAadharNumber(Aadhar);
		
		System.out.println("Enter Mobile Number");
		String mobNum = sc.next();
		c1.setMobileNumber(mobNum);
		
		Demo d1 = new Demo();
		
		if(d1.validate(c1.getAadharNumber(), c1.getMobileNumber(), c1.getName())==true) {
			System.out.println("Vallidation Successfull ");
		}else {
			System.out.println("Try Again");
		}
		;
		
		sc.close();
		
		
		
		
	}
	
}
