package com.pratmodi.debug;

public class program3{
	
	public static void main(String[] args) {
		// x^2 means x squared
		// Will solve the equation x^2 -2x + 1 = 0
		quadraticSolver(1, -2, 1);
		
		quadraticSolver(1, -8, 15);
		quadraticSolver(1, 0, 4);
		quadraticSolver(2, 0.5, -10);
		quadraticSolver(10, 5, 25);
	}
	
	private static void quadraticSolver(double a, double b, double c) {
		double determinant = (b * b - 4 * a * c);
		double solution1 = (-b + Math.sqrt(determinant)) / 2 * a;
		double solution2 = (-b - Math.sqrt(determinant)) / 2 * a;
		
		System.out.println("First solution is " + solution1);
		System.out.println("Second solution is " + solution2);
	}
}