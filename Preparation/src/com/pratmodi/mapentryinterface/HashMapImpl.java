package com.pratmodi.mapentryinterface;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapImpl implements Iterable {

	private HashMap<Integer, String> hm = new HashMap<Integer, String>();
	
	@Override
	public Iterator iterator() {
		hm.put(1, "Ronav");
		hm.put(2, "Kumar");
		
		System.out.println("Initial Mappings are: " + hm); 
		  
        // Using entrySet() to get the set view 
        System.out.println("The set is: " + hm.entrySet()); 
		
		return null;
	}


	
}
