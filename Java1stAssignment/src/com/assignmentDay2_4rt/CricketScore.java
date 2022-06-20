package com.assignmentDay2_4rt;

public class CricketScore {
	
	public static void cricketScore(int _1s,int _2s, int _3s, int fours, int sixes) {
		
		int score = 1*_1s+2*_2s+3*_3s+4*fours+6*sixes;
		System.out.println(score);
		
	}
	public static void main(String[] args) {
		
		cricketScore(5, 7, 8, 4, 2);
	}
	
	
}
