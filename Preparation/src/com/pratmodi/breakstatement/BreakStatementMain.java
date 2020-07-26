package com.pratmodi.breakstatement;

public class BreakStatementMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 0;
		while (i < 10) {
			System.out.println(i);
			try {
				if (i == 7) {
					throw new Exception();
				}
				i++;
			} catch (Exception e) {
				break;
			}
			System.out.println("Inside while  loop..");
		}
		System.out.println("out of loop");
	}

}
