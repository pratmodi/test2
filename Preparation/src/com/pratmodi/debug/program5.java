package com.pratmodi.debug;

import java.util.ArrayList;
import java.util.List;

public class program5 {

	public static void main(String[] args) {
		List<String>  fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Guava");
		
		for(String fruit: fruits) {
			if(fruit.contains("a")) {
				fruits.remove(fruit);
			}
		}
		
		System.out.println(fruits.toString());
	}

}
