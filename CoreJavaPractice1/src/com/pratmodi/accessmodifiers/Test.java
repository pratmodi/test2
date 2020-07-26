package com.pratmodi.accessmodifiers;

class Test {

	public static void main(String[] args) {

		Person p = new Person();
		Employee e = new Employee();
		
		p.nameOfClass();
		e.isEmployeeClass();
		
		//below is code to instantiate Abstract class
		AbstractTechnician at = new AbstractTechnician();
	}

}
