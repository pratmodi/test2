package com.pratmodi.scrap;

public class OuterClass1 {

	int id;
	String name;
	static String CoderName;
	public void ClassName() {
		System.out.println("This Class is StaticClass1");
	}
	
	static class InnerClass{
		int salary;
		
		protected void getSalary() {
			System.out.println("Salary in this inner static class is:"+salary);
		}
		
		protected static void getCoderName() {
			System.out.println("The value of CoderName variable is:"+CoderName);
		}
		
	}
	
}
