package com.pratmodi.accesmodifier;

class Public {

	int data;
	String name;
	
	public Public(int data, String name) {
		super();
		this.data = data;
		this.name = name;
	}
	
	void printName() {
		System.out.println("Name is:"+name);
	}
	
}
