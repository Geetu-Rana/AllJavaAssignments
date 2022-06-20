package com.assignment11;

public interface X {

	abstract void fun1();
	
	default void fun2() {
		System.out.println("inside method 2");
	}
	static void fun3() {
		System.out.println(" inside method2");
	}
	
}

interface Y{
	abstract void fun1();
	
	default void fun2() {
		System.out.println("Inside method2");
	}
	public static void fun3() {
		System.out.println("insside fun3");
	}
}

interface Z extends X,Y{
	
	abstract void funZ();
	
	@Override
	default void fun2() {
		// TODO Auto-generated method stub
		X.super.fun2();
	}
	
	
}



