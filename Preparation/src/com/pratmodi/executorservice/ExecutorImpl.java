package com.pratmodi.executorservice;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorImpl {

	//http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		
		executorService.execute(new Runnable() {
			public void run() {
				System.out.println("Asynchronous task..");
			}
		});
		
		executorService.shutdown();
		
	// -  //Following is the scribble code
		
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		
		Future future = executorService2.submit(new Runnable() {

			@Override
			public void run() {
				System.out.println("Asynchronous Task..");
			}
		});
		future.get();
		
		
		ExecutorService executorService3 = Executors.newSingleThreadExecutor();
		
		Future future2 = executorService3.submit(new Callable() {

			@Override
			public Object call() throws Exception {
				System.out.println("Asynchronous Callable..");
				return "Callable Result";
			}
		});
		System.out.println("future.get(): "+ future2.get());
		
	}
	
}
