package com.assigenment2day9;

public class Child extends Parent {
	
	
	
	@Override 
	public void method1() {
		System.out.println("Enter no is :"+number+" " + "This is method 1 of Parrent class overriden");
	}
	
	public void method3() {
		System.out.println("inside method 3 of Child class OverRidden");
	}
	
	public void method4() {
		System.out.println("Inside method 4 of child class");
	}
}
