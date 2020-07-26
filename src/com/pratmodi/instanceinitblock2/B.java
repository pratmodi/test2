package com.pratmodi.instanceinitblock2;

public class B extends A {

	B() {
		//super();
		System.out.println("child class constructor invoked");
	}

	B(int a) {
		super();
		System.out.println("child class constructor invoked " + a);
	}

	{
		System.out.println("instance initializer block is invoked");
	}

	public static void main(String args[]) {
		B b1 = new B();
		B b2 = new B(10);
	}

}
