package com.code;

public class Book {
	
	private int id;
	private static int count;
	private String name;
	private double price;
	
	public Book() {}
	
static {
System.out.println("Static block Executed");
	count=1000;
}

public String toString() {
	
	return id+" "+name+" "+price;
	
}
	public Book(String name,double price) {
		count=count+1;
		this.id=count;
		this.name=name;
		this.price=price;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}
	

}
