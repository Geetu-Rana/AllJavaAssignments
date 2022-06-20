package day10Assignment4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Area a1 = new Area();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter radius of Circle");
		int radius = sc.nextInt();
		System.out.println("Enter Length of Rectangle");
		int length = sc.nextInt();
		System.out.println("Enter Breadthof Rectangle");
		int breadth = sc.nextInt();
		
		System.out.println("Enter Side of Square");
		int side = sc.nextInt();
		
		System.out.println("Area of Circle : " + a1.circleArea(radius));
		System.out.println("Area Of Rectangle : "+ a1.rectangleArea(length, breadth));
		System.out.println("Area of Square :"+ a1.squareArea(side));
	
		sc.close();
		
	}
}
