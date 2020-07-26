package com.pratmodi.objectpooling;

import static org.junit.Assert.fail;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class ParserFactoryTest {

	private ParserPool<String, String> pool;
	private AtomicInteger count = new AtomicInteger(0);
	
	@Before
	public void setUp() {
		GenericObjectPoolConfig config = new GenericObjectPoolConfig();
		config.setMaxIdle(1);
		config.setMaxTotal(1);
		config.setTestOnBorrow(true);
		config.setTestOnReturn(true);
		pool = new ParserPool<String, String>(new ParserFactory<String, String>(),config);
	}
	
	@Test
	public void test() {
		try {
			int limit = 10;
			ExecutorService es = new ThreadPoolExecutor(10, 10, 0L, TimeUnit.MILLISECONDS, new ArrayBlockingQueue<Runnable>(limit));
		
			for(int i=0;i<limit;i++) 
			{
				Runnable r = new Runnable() {
					
					@Override
					public void run() {
						Parser<String,String> parser = null;
						try {
							parser = pool.borrowObject();
							count.getAndIncrement();
							parser.parse(null, null);
						}catch (Exception e) {
							e.printStackTrace(System.err);
						}finally {
							if(parser!=null) 
							{
								pool.returnObject(parser);
							}
						}
						
					}
				};
				es.submit(r);
			}
			es.shutdown();
			try {
				es.awaitTermination(1, TimeUnit.MINUTES);
			}catch (InterruptedException ignored) {
				// TODO: handle exception
			}
			System.out.println("Pool stats:\n Created:["+ pool.getCreatedCount() + "], Borrowed:["+pool.getBorrowedCount());
			Assert.assertEquals(limit, count.get());
			Assert.assertEquals(count.get(), pool.getBorrowedCount());
			Assert.assertEquals(1, pool.getCreatedCount());
		}catch (Exception e) {
			fail("Exception: "+e);
		}
	}
	

}
