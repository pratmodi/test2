package com.pratmodi.innerclasses;

public class OuterClass {

	private int speed;
	
	class InnerClass{
		int innerClassSpeed = 200;

		public InnerClass(int innerClassSpeed) {
			this.innerClassSpeed = innerClassSpeed;
		}
		
		public int InnerClassmodifySpeed() {
			speed=100;
			return speed;
		}
	}
	
	public int OuterClassmodifySpeed() {
		return speed;
	}
	
}
