package com.code;

public class Trainer extends Person{
	private int id;
	private String dept;
	private String sal;

	public Trainer() {
		
		System.out.println("DEfault called");
	}
	public Trainer(int id,int age,String name,String city,String dept,String sal) {
		super(age,name,city);
		this.id=id;
		this.dept=dept;
		this.sal=sal;
		
	}
	
	public void Training() {
		System.out.println("training method from trainer");
	}
}
