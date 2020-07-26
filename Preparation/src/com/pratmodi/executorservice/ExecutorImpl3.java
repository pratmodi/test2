package com.pratmodi.executorservice;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorImpl3 {

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

		List<Future<String>> futures = executorService.invokeAll(callables);
		
		for(Future<String> f : futures) 
		{
			System.out.println("future.get(): "+f.get());
		}

		executorService.shutdown();
		
	}

}
