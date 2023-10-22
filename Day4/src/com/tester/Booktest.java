package com.tester;

import com.code.Book;

public class Booktest {

	public static void main(String[] args) {
			
		Book b1=new Book("richdad",1000.00);
		System.out.println(b1);
		Book b2=new Book("richdad",2000.00);
		System.out.println(b2);
		System.out.println(b2.hashCode());
		System.out.println(b1.hashCode());
	}

}
