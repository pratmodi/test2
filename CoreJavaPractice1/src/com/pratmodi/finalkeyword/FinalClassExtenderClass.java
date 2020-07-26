package com.pratmodi.finalkeyword;

public class FinalClassExtenderClass extends FinalClass {

	int salary;
	public enum COLOR {WHITE, BLACK};
	
	final String NameofClass() {
		System.out.println("Inside NameofClass() method of FinalClassExtenderClass");
		return getClass().toString();
	}
	
	final COLOR getColor() {
		return COLOR.BLACK;
	}
}
