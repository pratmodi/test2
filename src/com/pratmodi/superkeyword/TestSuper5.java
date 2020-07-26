package com.pratmodi.superkeyword;

public class TestSuper5 {

	public static void main(String args[]) {
		Person p1 = new Person(2, "Ankit");
		System.out.println(p1.id+p1.name);
		
		
		Person p2 = new Employee(3, "Modi", 50000f);
		
		
		Employee e2 = new Person();
		
		
	Employee e1 = new Employee(1, "Prateek", 45000f);
	e1.display();
	System.out.println("From main() method calling e1.id & e1.id is = "+e1.id);
	System.out.println("From main() method calling e1.name & e1.name is = "+e1.name);
	System.out.println("From main() method calling e1.salary & e1.salary is = "+e1.salary);
	
	}
	
}
