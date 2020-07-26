package com.pratmodi.mapentryinterface;

import java.util.Iterator;

public class MainMapEntry {

	public static void main(String[] args) {

		/*
		 * MapEntryImpl obj1 = new MapEntryImpl();
		 *  obj1.initializeMapEntry();
		 */
		
		//Following is the code for Example1 class..
		
		  Example1 e1 = new Example1();
		  Iterator i = e1.iterator();
		  while (i.hasNext()) {
			String object = (String) i.next();
			System.out.println("Value returned of e1.iterator is: " + object);
		  }
		  
		 
	}

}
