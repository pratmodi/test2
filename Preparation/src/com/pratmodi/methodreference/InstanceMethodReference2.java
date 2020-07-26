package com.pratmodi.methodreference;

public class InstanceMethodReference2 {

	public void printMsg() {
		System.out.println("This is the instance method..");
	}
	
	public static void main(String[] args) {

		Thread t2 = new Thread(new InstanceMethodReference2()::printMsg);
		t2.start();
		
	}

}
