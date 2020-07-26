package com.pratmodi.debug;

import java.util.ArrayList;
import java.util.List;

public class solution5 {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Papaya");
		fruits.add("Guava");

		/*
		 * By debugging we can see that the problem arises when we attempt to change the
		 * collection we are currently editing. To get around this we can create a new
		 * array of the elements we want to remove and remove all these elements after
		 * the for loop.
		 */
		List<String> fruitstoGo = new ArrayList<String>();

		for (String fruit : fruits) {
			if (fruit.contains("a")) {
				fruitstoGo.add(fruit);
			}
		}

		fruits.removeAll(fruitstoGo);
		System.out.println(fruits.toString());

	}

}