package com.Practical;

public abstract class Ex8parent{
	private String product;
	private int price;
	public Ex8parent(String product, int price) {
		this.product = product;
		this.price = price;
	}
	
	
	public int getprice() {
		
		return price;
	}
	
	
	public String getproduct() {
		return product;
	}
	

	public abstract void display();
}

