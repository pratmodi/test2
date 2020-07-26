package com.pratmodi.innerclasses;

public class OuterClass1 {

	int i;
	
	class InnerClass1{
		int id;
		String name;
		
	
		public int getIDInner() {
			getIDOuter();
			return 0;
		}
		
	}
	
	{
		
	}
	
	public static int getIDOuter() {
		
		return 0;
	}
	
}
