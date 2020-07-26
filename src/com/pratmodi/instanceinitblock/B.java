package com.pratmodi.instanceinitblock;

public class B extends A{

	B(){
		//super();
		System.out.println("B constructor invoked");
	}
	
	{System.out.println("inside instance initializer block");}
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
	}
	
}
