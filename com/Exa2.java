package com.Practical;

public class Exa2 extends Ex2{

	public Exa2(String id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		Exa2 a = new Exa2("74393478", "atul");
		
		System.out.println(a.getId());
		System.out.println(a.getName());
		a.setId("868");
		a.setName("shinde");

		System.out.println(a.getId());
		System.out.println(a.getName());
	}

}
