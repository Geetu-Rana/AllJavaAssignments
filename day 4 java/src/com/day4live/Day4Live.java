package com.day4live;

public class Day4Live {
	int y = 10;
	static int i = 100 ;  
	public static void main(String[] args) {
		
		Day4Live d1 = new Day4Live();
		
		d1.y = 500;
		d1.i = 600;
		
		Day4Live d2 = new Day4Live();
		
		System.out.println(d1.y);
		System.out.println(d2.i);
	}

}
