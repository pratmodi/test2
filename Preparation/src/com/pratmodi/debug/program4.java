package com.pratmodi.debug;

public class program4 {

	public static void main(String[] args) {
		String hello1 = new String("Hello");
		String hello2 = "Hello";
		String hello3 = new String("Hello");

		if (hello1 == hello2 && hello1 == hello3) {
			System.out.println("Two strings are the same!");
		} else {
			System.out.println("Two strings are different");
		}

	}
}
