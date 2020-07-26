package com.pratmodi.thisandsuper;

public final class Flower extends Flora {

	int salary;
	
	Flower(){
		super("Vijay",2);
		//System.out.println("The value of super.name is: "+super.name);
		System.out.println("inside Flower default constructor");
	}


	public Flower(int salary) {
		//super();
		this.salary = salary;
		this.id = salary;
	}
	
}
