package com.pratmodi.statickeyword;

public class A {
	 int employee_id;
 static int id=10;

public static void getName() {
	id =6;
	System.out.println("The name of this class is: "+A.class.getSimpleName()+" and the value of id variable is: "+id);
	
}
}
