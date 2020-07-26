package com.pratmodi.superkeyword;

public class Employee extends Person {
float salary;



public Employee(int id, String name, float salary) {
	super(id, name);
	this.salary = salary;
}



void display() {
	System.out.println("Inside Employee's display method!");
}

}
