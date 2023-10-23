package com.tester;

import java.util.Scanner;

import com.code.Date;
import com.code.Employee;

public class TestContainment {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Date dob1=new Date();
		Employee emp1=new Employee();
		System.out.println(emp1);
		
		System.out.println("enter  empid name city  DOB(day,month,year):");
		Scanner sc=new Scanner(System.in);
		Employee emp2=new Employee(sc.nextInt(), sc.next(), sc.next(), new Date(sc.nextInt(), sc.nextInt()	, sc.nextInt()));
		
		System.out.println(emp2);
		
		
		
		
		
		

	}

}
