package com.pratmodi.accessmodifiers2;

import com.pratmodi.accessmodifiers.AbstractTechnician;
import com.pratmodi.accessmodifiers.Employee;
import com.pratmodi.accessmodifiers.Mechanic;
import com.pratmodi.accessmodifiers.Person;

class Test {

	public static void main(String[] args) {

		Person p = new Person();
		Employee e = new Employee();
		Mechanic m  = new Mechanic();
		AbstractTechnician at = new AbstractTechnician() {
		};
		
		p.nameOfClass();
		
		System.out.println(m.helloFromClass());
		
	}

}
