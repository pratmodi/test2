package com.pratmodi.begin;

public class Demo implements Runnable {

	public static void main(String[] args) {

        Thread guruThread1 = new Thread("Guru1");
        Thread guruThread2 = new Thread("Guru2");
        guruThread1.start();
        guruThread2.start();
        System.out.println("Thread names are following:");
        System.out.println(guruThread1.getName());
        System.out.println(guruThread2.getName());
        
        System.out.println("The prioirity of thread1 is: " + guruThread1.getPriority() + " and the prioirity of thread2 is: "+guruThread2.getPriority());;
		
	}

	@Override
	public void run() {
		
	}

}
