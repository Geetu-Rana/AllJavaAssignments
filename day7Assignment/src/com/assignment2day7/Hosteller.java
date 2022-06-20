package com.assignment2day7;

public class Hosteller extends Student {
	double hostelFee;
	
	@Override
	public double payFee() {
		return examFee+hostelFee;
	}
}
