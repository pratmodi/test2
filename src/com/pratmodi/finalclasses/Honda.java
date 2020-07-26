package com.pratmodi.finalclasses;

public class Honda extends Bike {

	void run() {
		System.out.println("Inside run() method of Honda class");
	}
	
	public static void main(String[] args) {

		Honda honda = new Honda();
		honda.run();
		
	}

}
