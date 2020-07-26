package com.pratmodi.objectpooling;

public interface Parser<E,T> {
	
	public void parse(E elementToBeParsed, T result);
	
	public boolean isValid();

	public void reset();
}
