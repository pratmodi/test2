package com.pratmodi.interfaces;

public class Test {

	public static void main(String[] args) {

		BaseInterface bi = new BaseInterface() {
			
			@Override
			public void nameofclass() {
				System.out.println("This is the BaseInterface interface");
			}
			
			@Override
			public void helloworld() {
				
				System.out.println("Hello World!");
			}
		};
		
		bi.nameofclass();
		
	}

}
