package com.code;

import java.util.Scanner;

public class TestString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Id");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name ");
		String name = sc.nextLine();

		 
		System.out.println("age:");
		int age = sc.nextInt();
		
		System.out.println(id+"    "+name+"    "+age);
		
		
		
		

	}

}
