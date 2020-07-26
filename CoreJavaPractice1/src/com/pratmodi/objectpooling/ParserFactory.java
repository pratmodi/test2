package com.pratmodi.objectpooling;

import org.apache.commons.pool2.BasePooledObjectFactory;
import org.apache.commons.pool2.PooledObject;

public class ParserFactory<E, T> extends BasePooledObjectFactory<Parser<E, T>> {

	@Override
	public Parser<E, T> create() throws Exception {
		// TODO Auto-generated method stub
		return new  XmlParser<E, T>();
	}


	@Override
	public PooledObject<Parser<E, T>> wrap(Parser<E, T> parser) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void passivateObject(PooledObject<Parser<E, T>> parser) throws Exception {
		// TODO Auto-generated method stub
		parser.getObject().reset();
	}


	@Override
	public boolean validateObject(PooledObject<Parser<E, T>> parser) {
		// TODO Auto-generated method stub
		return parser.getObject().isValid();
	}

	
	
}
