package com.pratmodi.innerclasses;

import com.pratmodi.innerclasses.OuterClass.InnerClass;

public class MainInnerOuter {

	public static void main(String[] args) {

		OuterClass oc = new OuterClass();
		
		
		//Following  is the code for StaticInnerClassExample class -
		
		StaticInnerClassExample.StaticInnerClass sic = new StaticInnerClassExample.StaticInnerClass(300);
		sic.StaticInnerClassmodifySpeed();
		
		
		
		
		
	}

}
