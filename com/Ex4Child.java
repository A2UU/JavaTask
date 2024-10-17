package com.Practical;

public class Ex4Child extends Ex4Parent {

	int quntaty;

	public Ex4Child(String product, int price, int q) {
		super(product, price);

		this.quntaty = q;
		// TODO Auto-generated constructor stub
	}

	public void display() {
		int price = super.getdata();

		System.out.println("price of 1 quntaty is       : " + price);
		System.out.println("you are parchese product is : " + quntaty);
		if (quntaty >= 1) {
		System.out.println(" Total price is             : " + (quntaty * price));
		}

	}

}
