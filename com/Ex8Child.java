package com.Practical;

public class Ex8Child extends Ex8parent {
	int quntaty;
	String color;

	public Ex8Child(String product, int price, int q,String c) {
		super(product, price);
		this.quntaty = q;
		this.color = c;
	}
	//overload
	public void addData(String c ) {
		this.color = c;	
	}
	//overload
	public void addData(int q) {
		this.quntaty = q;
	}
	//overload
	public void addData(int q , String c) {
		this.quntaty = q;
		this.color = c;
		
	}
	

	public void display() {
		
		int price = super.getprice();
		String  product = super.getproduct();
		
		System.out.println("price of 1 quntaty is       : " + price);
		System.out.println("Product is                  : "+product);
		System.out.println("you are parchese product is : " + quntaty);
		if (quntaty >= 1) {
		System.out.println(" Total price is             : " + (quntaty * price));
		
		}
		System.out.println("product color               : "+color);

	}

}
