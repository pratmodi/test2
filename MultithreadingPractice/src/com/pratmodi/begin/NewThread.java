package com.pratmodi.begin;

public class NewThread implements Runnable {

	Thread t;

	NewThread(){
		t = new Thread(this,"Demo Thread");
		System.out.println("Child Thread: " + t);
		t.start();
	}
	
	
	@Override
	public void run() {
		
		try {
			for(int i=5;i>0;i--) 
			{
				System.out.println("Child Thread: "+i);
				Thread.sleep(500);
			}
		}catch(InterruptedException e) {
			e.printStackTrace();
			System.out.println("Child thread interrupted!");
		}
		System.out.println("Exiting child thread.");
	}

}
