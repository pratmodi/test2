package com.pratmodi.begin;

public class Producer {
	Q q;

	public Producer(Q q) {
		this.q = q;
		new Thread("Producer").start();
	}
	
	public void run() {
		int i=0;
		
		while(true) 
		{
			q.put(i++);
		}
	}
}
