package com.pratmodi.innerclasses;

public class StaticInnerClassExample {

		private static int speed;
		
		static class StaticInnerClass{
			int StaticInnerClassSpeed = 200;

			public StaticInnerClass(int innerClassSpeed) {
				this.StaticInnerClassSpeed = innerClassSpeed;
			}
			
			public int StaticInnerClassmodifySpeed() {
				speed=100;
				return speed;
			}
		}
		
		public int StaticInnerClassExamplemodifySpeed() {
			return speed;
		}
		
}

	

