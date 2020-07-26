package com.pratmodi.debug;

public class solution2 {
	
	public static void main(String[] args) {
		System.out.println("Program starting ...");
		long fib45 = fibEfficient(45);
		System.out.println("The 45th fibonacci number is: " + fib45);
	}
	
	public static long fibEfficient(int input){
		long spare = 1;
		long num1 = 1;
		long num2 = 1;
		
		for (int i = 2; i < input; i ++){
			spare = num1;
			num1 = num2;
			num2 += spare;
		}
		
		return num2;
	}

}
