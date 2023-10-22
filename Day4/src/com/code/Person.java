package com.code;

public class Person {
	private int age;
	private String name;
	private String city;
	
	public Person(){
		this.age=15;
		this.name="Lokesh";
		this.city="Bikaner";
	}
	
	public Person(int age,String name,String city) {
		this.age=age;
		this.name=name;
		this.city=city;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public String Showdata() {
		
		return this.age+" "+this.name+" "+this.city;
	}

	
}
