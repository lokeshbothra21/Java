package com.code;

public class Employee {
private int empid;//empid=10
private String name,city;
//dob: d1,m1,y1
//doj:d2,m2,y2
//doc:d3,m3,y3
 
//Date class used for storing day,month,year

private Date dob; 
//has-a :containment :One class objected is used as data memeber 
//of another class

public Employee()
{
	this.empid=101;
	this.name="Ram";
	this.city="Pune";
	this.dob=new Date();//default values to dob
	
}


public Employee(int empid,String name,String city,Date dob) {
	
	this.empid=empid;
	this.name=name;
	this.city=city;
	this.dob=dob;
	
	
	
}

public String toString() {
	return "Employee :"+empid+"   Name:"+name+"   City:"+city  +"  DOB:"+dob;
}















}
