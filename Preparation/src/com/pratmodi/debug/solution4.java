package com.pratmodi.debug;

public class solution4 {
	
	public static void main(String[] args) {
		String hello1 = new String("Hello");
		String hello2 = "Hello";
		String hello3 = new String("Hello");
		
		/* Need to use .equals() rather than == to compare the value rather than 
		the reference of the three strings */
		if(hello1.equals(hello2) && hello1.equals(hello3)) {
			System.out.println("All three strings are the same!");
		}else {
			System.out.println("Two strings are different");
		}
	}


}
