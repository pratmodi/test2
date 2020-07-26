package com.pratmodi.abstractandinterfaces;

public abstract class Computer {

	String device;
	Computer i;
	
	String getDeviceType() {
		//System.out.println("This is a :");
		return "This is a :" + device;
	}
	
	public Computer interfaceMethod() {
		return i;
	}
	
}
