package com.pratmodi.statickeyword;

public class B extends A{

	public void getID() {
		
	}
	@Override
	public static void getName() {
		System.out.println("The name of this class is: "+A.class.getSimpleName()+" and the value of id variable is: "+id);

	}
	
	public static void main(String[] args) {
		A a = new A();
		a.getName();
		B b = new B();
		b.getName();
	}

}
