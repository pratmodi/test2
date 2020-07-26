package com.pratmodi.instanceinitblock;

public class Bike {

	int speed;
	
	Bike(){
		System.out.println("Inside default constrcutor..");
		System.out.println("Speed is "+speed);
	}
	
	{
		speed = 100;
	}
	
	public static void main(String[] args) {

		Bike b1 = new Bike();
		Bike b2 = new Bike();
		
		System.out.println("From main() method.. b1.speed is "+b1.speed);
		System.out.println("From main() method.. b2.speed is "+b2.speed);

		
	}

}
