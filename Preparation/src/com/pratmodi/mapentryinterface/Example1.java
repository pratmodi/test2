package com.pratmodi.mapentryinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 implements Iterable<String> {

	private List<String> list = new ArrayList<String>();
	
	@Override
	public Iterator<String> iterator() {
		list.add("Prateek Modi");
		list.add("Ruchita Modi");
		return list.iterator();
	}

}
