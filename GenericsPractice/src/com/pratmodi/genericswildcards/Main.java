package com.pratmodi.genericswildcards;

import java.text.ParseException;
import java.text.RuleBasedCollator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws ParseException {

		Collection<?> coll =  new  ArrayList<String>();
		
		List<? extends Number> list = new ArrayList<Long>();
		
		//Following will give compile time error as they are invalid...
		
		List<? extends Number> list2 = new ArrayList<Integer>();
		
		Comparator<? super String> cmp = new RuleBasedCollator(new String("ABC"));
		
	}

}
