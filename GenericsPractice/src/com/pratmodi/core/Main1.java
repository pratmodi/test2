package com.pratmodi.core;

public class Main1 {

	public static void main(String[] args) {

		Example1 e1 = new Example1();
		e1.getList1();
		Example3<String> instance = new Example3<String>();
		instance.set("Prateek");
		//instance.set(123);
		
		
		//For generic Array Class - 
		String[] array1 = {"Prate","Modi","Vim","lesh","Anshu","Modi","Sah","Rahul","Ruchita","Modi","Ronav"};
		GenericArray<String> ga  = new GenericArray<String>();
		ga.initializeArray(array1);
		System.out.println(array1.toString());
		
		
	}

}
