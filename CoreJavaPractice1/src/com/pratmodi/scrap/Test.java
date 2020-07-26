package com.pratmodi.scrap;

import com.pratmodi.scrap.OuterClass1.InnerClass;

public class Test {

	public static void main(String[] args) {

		Class1 c1 = new Class1();
		c1.helloWorld();
		
		Class2 c2 = new Class2();
		c2.runSuperClassMethod();
		
		Class1 c11 = new Class2();
		
		Class2 c21 = (Class2) new Class1();
		
		InnerClass ic = new InnerClass();
		ic.getCoderName();
		
	}

}
