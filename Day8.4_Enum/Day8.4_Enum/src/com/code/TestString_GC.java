package com.code;

public class TestString_GC {

	public static void test1() {
		System.out.println("---test1----");
		Vehicle obj=new Vehicle(122, "Activa", "red");//local 
		System.out.println(obj);
		System.out.println("---test1 ends----");
	}
	
	
	public static void main(String[] args) {
		 System.out.println("---Main----");
		test1();
		System.gc();
		Vehicle v1=new Vehicle(23, "abc", "red");
		
		v1=null;//
		
		  new Vehicle(231, "abc2", "red");	
		
		
		System.out.println("----main ends------");

	}

}
