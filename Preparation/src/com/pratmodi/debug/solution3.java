package com.pratmodi.debug;

public class solution3 {
	
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
		
		/* if the determinant is negative then we are trying to find the square root
		 of a negative number which isn't possible. So if this is the case we need
		 to print that there are no solutions and exit the program */
		if(determinant < 0) {
			System.out.println("There are no solutions!");
			return;
		}
		
		double solution1 = (-b + Math.sqrt(determinant)) / 2 * a;
		double solution2 = (-b - Math.sqrt(determinant)) / 2 * a;
		
		System.out.println("First solution is " + solution1);
		System.out.println("Second solution is " + solution2);
	}

}