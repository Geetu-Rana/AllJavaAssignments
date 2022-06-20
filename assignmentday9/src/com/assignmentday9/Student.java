package com.assignmentday9;

public class Student {
	private int roll;
	private String name;
	private int markl;
	private char grade;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarkl() {
		return markl;
	}
	public void setMarkl(int markl) {
		this.markl = markl;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		calculateGrade();
		this.grade = grade;
	}
	public void displayDetails() {
		
		calculateGrade();
		System.out.println(name);
		System.out.println(roll);
		System.out.println(markl);
		System.out.println(grade);
	}
	public void calculateGrade() {
		if(markl>=500) {
			grade ='A';
		}else if(markl<500 && markl>=400) {
			grade ='B';
			
		}else {
			grade = 'C';
		}
	}
	@Override
	public String toString() {
		return roll+" "+name+" "+markl+" "+grade;
	}

}
