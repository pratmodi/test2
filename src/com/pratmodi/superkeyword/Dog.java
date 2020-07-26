package com.pratmodi.superkeyword;

public class Dog extends Animal{

	Dog(){
		//super();
		System.out.println("Dog constructor");
	}
	
	void eat() {
		System.out.println("Eating Bones..");
	}
	
	void bark() {
		System.out.println("Dog Barking..");
	}
	
	void work() {
		super.eat();
		bark();
	}
	
}
