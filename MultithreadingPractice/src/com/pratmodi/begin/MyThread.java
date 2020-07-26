package com.pratmodi.begin;

public class MyThread extends Thread {

	Thread t1 = Thread.currentThread();
	
	public static void main(String[] args) {
		MyThread thread = new MyThread();
		thread.getPriorityofThread();
		thread.run();
		
	}

	@Override
	public void run() {
		
		
		Thread[] tarray = new Thread[15];
		tarray[0] = t1.currentThread();
		
		System.out.println("Inside run() method. The priority of main thread is: "+t1.getPriority());
		System.out.println(tarray[0].toString());
		
	}
	
	public void getPriorityofThread() {
		System.out.println("Prioirty before setting max priority is: "+ t1.getPriority());
		t1.setPriority(MAX_PRIORITY);
		System.out.println("Prioirty after setting max priority is: "+ t1.getPriority());
	}

}
