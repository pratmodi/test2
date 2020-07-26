package com.pratmodi.mapentryinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class MapEntryImpl {

	public Set initializeMapEntry() {
		LinkedHashMap<Integer, String> lhm = new LinkedHashMap<Integer, String>();
		
		lhm.put(25000, "1-Bedroom");
		lhm.put(50000, "2-Bedroom");
		lhm.put(75000, "1-Bedroom-Hall");
		lhm.put(65000, "2-Bedroom-Hall");
		
		Set<Map.Entry<Integer, String>> s = lhm.entrySet();
		
		for(Map.Entry<Integer, String> it : s) 
		{
			System.out.println("Before change of value = "+it.getKey() + " "+it.getValue());
			String[] randomString = {"Mod","Modi","Sah","Kumar","Ruchita","Rahul","Ronav"};
			for(int i=0;i<=0;i++) 
			{
				// int index = (int) Math.random();
				Random r = new Random();
				int index =  r.nextInt((randomString.length -1));
				System.out.println("Inside Random generator & the  random String is: "+randomString[index]);
			}
			System.out.println("After Random loop, the key is = "+it.getKey()+" value is: "+it.getValue());
		}
		return s;
	}
	
}
