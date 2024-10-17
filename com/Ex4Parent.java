package com.Practical;

public class Ex4Parent {
	
	private String product;
	private int price;
	public Ex4Parent(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}
	
	public int getdata() {
		System.out.println("Product Name                :"+product);
//		System.out.println("Product Price"+price);
		return price;
	}
	

}
