package com.assignmentDay2_3rd;

public class SumofNaturalNum {
	public static void sumOfNaturalNum(int N) {
		int sum = N*(N+1)/2 ;
		System.out.println(sum);
	}
	
	public static void main(String[] args) {
		int N = 5;
		sumOfNaturalNum(N);
	}
}
