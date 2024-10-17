package com.Practical;

public class Ex6Parent {
	
	private String product;
	private int price;
	public Ex6Parent(String product, int price) {
		super();
		this.product = product;
		this.price = price;
	}
	
	public void display() {
		System.out.println("Product Name                :"+product);
	}
	
	public int getprice() {
		return price;
	}

}
