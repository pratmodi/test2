package com.pratmodi.finalkeyword;

public class FinalClass {

	static final int id=10;

	static class InnerClass{
		{
			System.out.println("The value of id is: "+id);
		}
	}
	
	public void ClassName() {
		System.out.println("The name of this class is FinalClass");
	}
	
}
