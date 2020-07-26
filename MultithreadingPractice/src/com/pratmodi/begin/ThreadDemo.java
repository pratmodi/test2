package com.pratmodi.begin;

public class ThreadDemo {

	public static void main(String[] args) {
		new NewThread();
		
		try {
			for(int i=5;i>0;i--) 
			{
				System.out.println("Main thread: "+ i);
				Thread.sleep(1000);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Exception occurred!");
		}
		System.out.println("Main thread exiting...");
	}

}
