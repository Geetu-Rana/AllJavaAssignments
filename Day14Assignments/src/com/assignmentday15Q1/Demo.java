package com.assignmentday15Q1;

public class Demo {

	public static void main(String[] args) {
		Account acc = new Account("12345678");
		acc.deposit(5000);
		try {
			int x = 51000;
			double ammount = acc.widwrall(x);
			System.out.println("Balance Amt "+ ammount);
			
			
		}catch(InsuficientFundException ife) {
			System.out.println(ife.getMassege());
		}
	
	}

	
}
