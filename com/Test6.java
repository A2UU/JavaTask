package com.Practical;

public class Test6 {

	public static void main(String[] args) {
		Ex6Child c  = new Ex6Child("pant", 400, 4,"white");
		c.display();
		
		System.out.println();
		c.addData(7);
		c.display();
		
		
		System.out.println();
		c.addData("blue");
		c.display();
		
		
		System.out.println();
		c.addData(5,"green");
		c.display();
	}


}
