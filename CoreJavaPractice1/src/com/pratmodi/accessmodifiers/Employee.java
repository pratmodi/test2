package com.pratmodi.accessmodifiers;

public class Employee extends Person {

	protected boolean isEmployeeClass() {
		if(getClass().equals(Employee.class)) {
			System.out.println("Its this Employee class!");
			return true;
		}
		System.out.println("Its not the Employee class!");
		return false;
	}
	
}
