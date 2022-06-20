package com.assignmentday15Q1;

public class Account {
	
	private String accNo;
	private double balance;
	
	public Account(String accNo) {
		this.accNo = accNo;
	}
	public void deposit(int amount) {
		double total = this.balance + amount;
		this.balance = total;
	}
	
	public double widwrall(int ammount) throws InsuficientFundException{
		if(ammount<balance) {
			return balance-ammount;
		}else {
			
			InsuficientFundException ife = new InsuficientFundException("Please enter Valid Ammount");
			throw ife;
		}
		
	}
	
	
}
