package com.Assignmentday14Q2;

public class InvalidCountreyException extends Exception {

	private String maessage;
	
	public InvalidCountreyException(String msg) {
		this.maessage = msg;
	}
	public String getMessage(){
		return this.maessage;
	}
	
	
}
