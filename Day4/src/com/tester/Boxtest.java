package com.tester;

import com.code.Box;

public class Boxtest {

	public static void main(String[] args) {
			Box b1=new Box(40,50,60);
			System.out.println(b1);
			Box b2=new Box(50,60,70);
			System.out.println(b2);
			Box b3=new Box(50,60,70);
			System.out.println(b3);
//		Box b4=new Box();
//		System.out.println(b4);
			if(b1==b2) {
				System.out.println("b1==b2");
			}
			if(b2==b3) {
				System.out.println("b2==b3");
			}
			else
				System.out.println("b1!=b3");
			
			System.out.println(b1.hashCode()+"+"+b2.hashCode());
			boolean result=b2.isSame(b3);
			System.out.println(result);
			if(result==true)
				System.out.println("b2==b3");
			else
				System.out.println("b2!=b3");
	}

}
