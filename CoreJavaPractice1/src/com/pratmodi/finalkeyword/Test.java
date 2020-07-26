package com.pratmodi.finalkeyword;

import com.pratmodi.finalkeyword.FinalClass.InnerClass;

public class Test {

	public static void main(String[] args) {

		FinalClass fc = new FinalClass();
		fc.ClassName();
		
		FinalClassExtenderClass fce = new FinalClassExtenderClass();
		fce.NameofClass();
		System.out.println(fce.getColor());
		
	}

}
