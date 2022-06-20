package day10Assignment;

import java.util.Scanner;

public class Demo {

	public Hotel provideFood(int amount){
		if(amount>1000) {
			Hotel taj = new TajHotel();
			return taj;
		}else if(amount>=200 && amount<=1000) {
			
			Hotel roadSide = new RoadSideHotel();
			return roadSide;
		}else {
			return null;
		}
	}
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the amount");
		int rupee = sc.nextInt();
		Demo d1 = new Demo();
		
		Hotel hotel = d1.provideFood(rupee);
		if(hotel !=null) {
		hotel.chickenBiryani();
		hotel.masalaDosa();
		
		if(hotel instanceof TajHotel) {
		TajHotel taj = (TajHotel) hotel;
		taj.welcomeDrink();
		}
		}else {
			System.out.println("Enter Proper Amount or More then 200 ");
		}
		sc.close();
	}
	
}
