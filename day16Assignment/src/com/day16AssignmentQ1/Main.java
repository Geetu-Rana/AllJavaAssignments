package com.day16AssignmentQ1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Product> p1 = new ArrayList<>();
	
//		 p1.add(new Product(20,"Amit",520));
//		 p1.add(new Product(15,"Suresh",550));
//		 p1.add(new Product(22,"Amit",540));
//		 p1.add(new Product(18,"Rajesh",590));
//		
		 
		while(true) {
			System.out.println("Enter Product id");
			int productId = sc.nextInt();
			
			System.out.println("Enter Product Name");
			String productName = sc.next();
			
			System.out.println("Enter Product Price");
			double price = sc.nextDouble();
			
			Product product = new Product(productId,productName,price);
			
			p1.add(product);
			
			System.out.println("Want to add more product (y/n)");
			String choice = sc.next();
			if(choice.equalsIgnoreCase("n"))
				break;
		}
		
		
		 
		 System.out.println("Printing Details of all Product");         
		 System.out.println("=================================");         
		// for(Product i: p1){  
//	         System.out.println("Roll is :"+i.getProductId());
//	         System.out.println("Name is :"+i.getProductName());
//	         System.out.println("Marks is :"+i.getProductPrice());  
//	         System.out.println("-----------------------------"); 
		
		// }
		 
		 System.out.println("Enter 1 for sorting the product according to the productPrice");
		 System.out.println("Enter 2 for sorting the product according to the productName");
		 System.out.println("Enter 3 for sorting the product according to the ProductId");
 
		 int choice = sc.nextInt();
		 if(choice == 1) {
			 Collections.sort(p1,new ProductCOmpareToPrice());
		 }else if(choice == 2) {
			 Collections.sort(p1,new ProductCompareToName());
		 
		 }else if(choice ==3) {
			Collections.sort(p1, new ProductIdCompartor()); 
		 }else {
			 Collections.sort(p1, new ProductIdCompartor());
		 }
		 
		 
		 
		 
		 System.out.println(p1);
		 sc.close();
	}
	
}
