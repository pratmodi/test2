package com.pratmodi.breakstatement;

public class BreakStatementMain2 {

	public static void main(String[] args) {

		int i;
		for(i=0;i<10;i++) {
			System.out.println(i);
			try {
				if (i == 7) {
					throw new Exception();
				}
				//i++;
			} catch (Exception e) {
				break;
			}
			System.out.println("Inside for loop..");
		}
		System.out.println("out of loop");
	}
}
