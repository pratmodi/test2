package com.pratmodi.begin;

public class Consumer {

	Q q;
	
	Consumer(Q q){
		this.q = q;
		new Thread("Consumer").start();
	}
	
	public void run() {
		while(true) 
		{
			q.get();
		}
	}
	
}
