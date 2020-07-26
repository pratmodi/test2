package com.pratmodi.staticclasses;

import com.pratmodi.staticclasses.StaticClass1.InnerClass;

public class Test {

	public static void main(String[] args) {

		StaticClass1 s1 = new StaticClass1();
		s1.ClassName();
		
		InnerClass ic = new InnerClass();
		ic.getSalary();
		ic.getCoderName();
		
		
	}

}
