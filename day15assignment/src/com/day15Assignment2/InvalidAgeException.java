package com.day15Assignment2;


public class InvalidAgeException extends Exception{
	private String message;
	
	public InvalidAgeException(String msg) {
		this.message = msg;
	}
	public String InvalidAgeException() {
		return this.message;
	}
	
	
}