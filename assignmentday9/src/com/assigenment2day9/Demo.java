package com.assigenment2day9;

import java.util.Scanner;

public class Demo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter no between 1-9");
		int num = sc.nextInt();
		if(num>0 && num<10) {
			
			Child ch = new Child();
//			ch.number = num;
			ch.method1();
			ch.method2();
			ch.method3();
			ch.method4();
			
		}else{
			System.out.println("Invalid Number");
		}
		
	}
	
}
