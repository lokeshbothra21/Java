package com.code;

public class Employee {
	private int empid;
	private String name;
	private double salary;
	
	public Employee(){
		this.empid=100;
		this.name="lokesh";
		this.salary=10000;
	}
	
	public Employee(int empid,String name,double salary) {
		super();
		this.empid=empid;
		this.name=name;
		this.salary=salary;
	}	
	public void calSal() {
		System.out.println("Calculated salary is:"+salary);
	}
	
	public String toString() {
		return "id:"+empid+"name:"+name+"salary:"+salary;
		
	}
}
