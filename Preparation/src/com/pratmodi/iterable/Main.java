package com.pratmodi.iterable;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) {

		SortedMap<Integer, String> sm = new TreeMap<Integer, String>();
		sm.put(new Integer(2), "Prateek");
		sm.put(new Integer(3), "Modi");
		
		Set s = sm.entrySet();
		
		Iterator i = s.iterator();
		
		while(i.hasNext()) 
		{
			Map.Entry<Integer, String> m = (Entry<Integer, String>) i.next();
			int key = m.getKey();
			String value = m.getValue();
			System.out.println("Key: "+key+" Value: "+value);
		}
		
	}

}
