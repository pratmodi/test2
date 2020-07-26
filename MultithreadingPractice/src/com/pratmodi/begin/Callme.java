package com.pratmodi.begin;

public class Callme {

	void call(String msg) {
		System.out.println("["+msg);
		
		try {
			Thread.sleep(1000);
			}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred!");
		}
		System.out.println("]");
	}
	
}
