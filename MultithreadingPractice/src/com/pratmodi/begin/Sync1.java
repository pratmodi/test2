package com.pratmodi.begin;

public class Sync1 {

	public static void main(String[] args) {

		Callme target = new Callme();
		Caller obj1 = new Caller(target, "Hello");
		Caller obj2 = new Caller(target, "Synchronized");
		Caller obj3 = new Caller(target, "World");
		
		try {
			obj1.t.join();
			obj2.t.join();
			obj3.t.join();
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Exception occurred..");
		}
	}

}
