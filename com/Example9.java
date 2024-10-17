package com.Practical;

public class Example9 {
	public static void main(String[] args) {
		StringBuffer s = new StringBuffer("hello world ");
		s.replace(s.length(), s.length(), "The Kiran Academy");
		System.out.println(s);
	}

}
