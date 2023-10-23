package com.tester;

import java.util.Random;
import java.util.Scanner;

import com.bank.BankAccount;
import com.code.OuterClass;

public class TestBankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//OuterClass.StaticClass obj= new OuterClass.StaticClass();
		//Lab :Create menu driven BankAccount Application
		//1:Show all act 2: Add New Account 2:edit Name 3:Remove 4:Apply For Locker 5:Show all LockerHolders
  	
		
	BankAccount act1=new BankAccount(1056, "Vaishali", 50000);
	System.out.println(act1);
	
	System.out.println("Do You Want To Apply  For Locker (Yes/No)");
	String answer;
	Scanner sc=new Scanner(System.in);
	answer=sc.next();
	
	 
 
	
 
	if(answer.equals("Yes")) {
		System.out.println("Enter LockerId Duration    ");
		act1.assignLocker(444, 12);
		System.out.println(act1);
	}
	else
	{
		System.out.println(act1);
	}
	
		 
		
		
		
	}

}
