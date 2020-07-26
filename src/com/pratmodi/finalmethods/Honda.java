package com.pratmodi.finalmethods;

public class Honda extends Bike {

	public void run() {
		System.out.println("Inside run method of Honda class");
	}
	
	
	public static void main(String[] args) {
		Honda honda = new Honda();
		honda.run();
	}

}
