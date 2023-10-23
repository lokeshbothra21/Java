package com.code;

public class Vehicle {

	private int vId;
	private String name;
	private  Colors  vColor;
	
	public static void display() {
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		 System.out.println("---external resource will get close here----");
		 System.out.println("---- object get removed-----");
	}

	public Vehicle(int id,String name,String color)
	{
		System.out.println("---Object Created On Heap-----");
		this.vId=id;
		this.name=name;
		//convert String into enum
		this.vColor=Colors.valueOf(color);
		//open connection with DB
	}

	@Override
	public String toString() {
		return "Vehicle [vId=" + vId + ", name=" + name + ", vColor=" + vColor.ordinal() + "]";
	}
	
}
