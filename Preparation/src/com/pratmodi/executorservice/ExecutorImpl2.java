package com.pratmodi.executorservice;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorImpl2 {

	//http://tutorials.jenkov.com/java-util-concurrent/executorservice.html
	
	public static void main(String[] args) throws InterruptedException, ExecutionException {

		ExecutorService executorService = Executors.newSingleThreadExecutor();
		
		Set<Callable<String>> callables = new HashSet<Callable<String>>();
		
		callables.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Task 1.";
			}
		});
		
		callables.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Task 2.";
			}
		});
		
		callables.add(new Callable<String>() {
			@Override
			public String call() throws Exception {
				// TODO Auto-generated method stub
				return "Task 3.";
			}
		});
		
		String result = executorService.invokeAny(callables);
		System.out.println("result = "+ result);
		executorService.shutdown();
	}

}
