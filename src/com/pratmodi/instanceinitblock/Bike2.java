package com.pratmodi.instanceinitblock;

public class Bike2 {

	int speed=10;
	
	Bike2(){
		System.out.println("Inside default constrcutor..");
		System.out.println("Speed is "+speed);
	}
	
	{
		System.out.println("1st block printing");
	}
	{
		System.out.println("Inside instance initializer");
		speed = 100;
	}
	
	String hello() {
		return "Inside hello() method.";
	}
	
	public static void main(String[] args) {

		Bike2 b1 = new Bike2();
	//	Bike2 b2 = new Bike2();
		
		System.out.println(b1.hello());
	//	b2.hello();
		
		System.out.println("From main() method.. b1.speed is "+b1.speed);
	//	System.out.println("From main() method.. b2.speed is "+b2.speed);

		
	}

}

