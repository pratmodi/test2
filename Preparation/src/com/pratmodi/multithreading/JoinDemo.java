package com.pratmodi.multithreading;

public class JoinDemo implements Runnable{

	//https://www.geeksforgeeks.org/java-concurrency-yield-sleep-and-join-methods/?ref=lbp

	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("Current Thread: "+t.getName());
		
		System.out.println("Is Alive? "+ t.isAlive());
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(new JoinDemo());
		t.start();
		t.join(1000);
		
		System.out.println("\nJoining after 1000"+" milliseconds: \n");
		System.out.println("Current thread: "+t.getName());
		
		System.out.println("Is Alive? "+t.isAlive());
		
	}

}
