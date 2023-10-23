package com.tester;

import com.code.OuterClass;

public class TestNestedClass {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass();
		
		System.out.println(outer);
		
		//OuterClass.InnerClass inner=outer.new InnerClass() ;
		
		//System.out.println(inner);
		
		outer.setInnerClass();
		System.out.println(outer.getInnerObj());
		
		
		outer.display();
		
		
		
	}

}
