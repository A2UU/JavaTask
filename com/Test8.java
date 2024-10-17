package com.Practical;

public class Test8 {

	public static void main(String[] args) {
		Ex8Child c  = new Ex8Child("pant", 400, 4,"white");
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
