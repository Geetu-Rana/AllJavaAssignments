package com.day16AssignmentQ1;


public class Product{
	private int productId;
	private String productName;
	private double productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public Product() {
		
	}
	
	public Product(int proId,String proName, double proPrice) {
		this.productId = proId;
		this.productName = proName;
		this.productPrice = proPrice;
	}
	
	public String toString() {
		return "[ Product : Product ID :" + productId+", Product Name :"+productName+", Product Price: "+ productPrice+" ]";
		
	}

	
	
	
	
	
}
