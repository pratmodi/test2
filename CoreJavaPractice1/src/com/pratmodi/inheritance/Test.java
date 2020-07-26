package com.pratmodi.inheritance;

public class Test {

	public static void main(String[] args) {

		Male m = new Boy();
		m.helloFromMale();
		
		
		Boy b = (Boy) new Male();
		b.helloFromBoy();
		
	}

}
