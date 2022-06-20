package com.assignmentday15Q1;

public class InsuficientFundException extends Exception {
	private String massege;
	
	public InsuficientFundException(String msg) {
		this.massege = msg;
	}

	public String getMassege() {
		return this.massege;
	}
	
	
	
}
