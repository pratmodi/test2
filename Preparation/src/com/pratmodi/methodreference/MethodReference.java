package com.pratmodi.methodreference;

public class MethodReference {

	public static void saySomething() {
		System.out.println("This is the static method.");
	}
	
	public static void main(String[] args) {

		Sayable sayable = MethodReference::saySomething;
		sayable.say();
		
	}

}
