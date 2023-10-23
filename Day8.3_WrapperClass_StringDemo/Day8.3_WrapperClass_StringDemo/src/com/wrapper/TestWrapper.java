package com.wrapper;

import java.util.ArrayList;

public class TestWrapper {

	public static void show(Object obj) {
		System.out.println(obj.toString());
	}
	
	
	public static void main(String[] args) {
		
		//Revise:widening  ,Narrowing:value type
		//UpCasting,DownCasting:only in Inheritance
		//now
		//AutoBoxing AutoUnBoxing
		
		
		int a=10;//primitive does not inherits java.lang.Object
		//Generics works on Object Type only
		//how we can use primitive data type:
		//Answer:User Wrapper Classes
		//Wrapper classes are used to convert primitive type into Object type
		 
     	 //for int primitive-------->Integer wrapper class
		
	    //till Java 5
		
		@SuppressWarnings("unused")
		Integer intObj=new Integer(a);//Primitive get assigned to reftype
		//Boxing:converting primitve type into object type
		
		//show(Object obj)
		show(intObj);//UpCasting
		
		
		//UnBoxing:converting ref type into  primitive type
		
		int b=intObj.intValue();//UnBoxing
		
		//java 5 onwords
		//AutoBoxing:boxing occur implicitly 
		int x=90;//primitive
		Integer intObj2=x;//AutoBoxing
		show(intObj2);	
		
		//AutoUnBoxing:unboxing occur implicitly
		int y=intObj2;//AutoUnBoxing
		
		int z=909;
		show(z);//z-->AutoBoxing--->UpCast
		
		
	 
		
		
		
		
		
		
		
		
		
	 

	}

}
