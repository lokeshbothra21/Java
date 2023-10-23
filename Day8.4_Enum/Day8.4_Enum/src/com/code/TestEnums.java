package com.code;

import java.util.Scanner;

public class TestEnums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Colors cols;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Color:");
		String str=sc.next();
		 //converting String value into enum type valueOf(String)
		 cols=Colors.valueOf(str.toLowerCase());
		 System.out.println("Color:"+cols);
		
		System.out.println("enter id name color(red,black,silver,white)");
		Vehicle vObj=new Vehicle(sc.nextInt(), sc.next(), sc.next().toLowerCase());
		
		System.out.println(vObj);
		
		
		
		
		
		
		
		
		
	}

}
