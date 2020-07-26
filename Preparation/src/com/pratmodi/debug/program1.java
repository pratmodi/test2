package com.pratmodi.debug;

public class program1 {

	public static void main(String[] args) {
		for (int i = 5; i >= 0; i--) {
			isZero(i);
		}
	}

	private static void isZero(int input) {
		switch (input) {
		case 0:
			System.out.println(input + " is 0!");
		default:
			System.out.println(input + " is not 0!");
		}
	}
}
