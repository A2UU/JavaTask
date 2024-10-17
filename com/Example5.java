package com.Practical;

public class Example5 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello ");
		s.delete(6, s.length());
		System.out.println(s);
	}

}
