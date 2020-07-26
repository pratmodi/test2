package com.pratmodi.thisandsuper;

public class Flora {

	String name = "Prateek";
	int id;
	//Flora flora;
	
	public Flora() {
		System.out.println("Inside private constructor of Flora");
	}
	
	
	
	public Flora(String name1, int id1 /*, Flora flora1*/) {
		//super();
		System.out.println("Inside parameterized constructor of Flora class");
		System.out.println("The value before this.name is: "+name);
		this.name = name1;
		System.out.println("The value after this.name is: "+name);
		this.id = id1;
		//this.flora = flora1;
	}



	protected String nameOfClass() {
		return getClass().toString();
	}
	
}
