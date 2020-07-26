package com.pratmodi.begin;

public class Q {
int n;
boolean valueSet = false;

synchronized int get(){                           
	while(!valueSet) 
	
		try {
			wait();
		}catch (Exception e) {
			System.out.println("Exccepttion occurred..");
		}
	System.out.println("Got: " + n);
	valueSet = false;
	notify();
	return n;
}

synchronized void put(int n) {
	while(valueSet)
		try {
			wait();
		}catch (Exception e) {
			System.out.println("Exception occurred");
		}
	this.n = n;
	valueSet = true;
	System.out.println("Put: "+ n);
	notify();
}

}

