package com.pratmodi.debug;

public class program2 {

	public static void main(String[] args) {
		System.out.println("Program starting ...");
		long fib45 = fib(45);
		System.out.println("The 45th fibonacci number is: " + fib45);
	}

	public static long fib(int input) {
		if (input == 1 || input == 2)
			return 1;
		else
			return fib(input - 1) + fib(input - 2);
	}

}
