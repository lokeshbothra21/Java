package com.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Doctor implements Serializable{
	
     private int docid;
     private String Dname;
     private String email;
     private String degree;
     private double salary;
     private LocalDate joining;
     private int experience;
     private Department dept;
	
     public Doctor(int docid, String dname, String email, String degree, double salary, LocalDate joining,
			int experience, Department dept) {
		super();
		this.docid = docid;
		this.Dname = dname;
		this.email = email;
		this.degree = degree;
		this.salary = salary;
		this.joining = joining;
		this.experience = experience;
		this.dept = dept;
	}

	public int getDocid() {
		return docid;
	}

	public void setDocid(int docid) {
		this.docid = docid;
	}

	public String getDname() {
		return Dname;
	}

	public void setDname(String dname) {
		Dname = dname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public LocalDate getJoining() {
		return joining;
	}

	public void setJoining(LocalDate joining) {
		this.joining = joining;
	}

	public int getExperience() {
		return experience;
	}

	@Override
	public boolean equals(Object obj) 
	{
		
		if(obj instanceof Doctor)
		{
			return this.email.equals(((Doctor) obj).getEmail());
		}
		return false;
		
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Department getDept() {
		return dept;
	}

	public void setDept(Department dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Doctor docid :" + docid + " Dname :" + Dname + " email :" + email + "  degree :" + degree + "  salary :"
				+ salary + "  joining :" + joining + " experience :" + experience + " dept :" + dept ;
	}
     
	
     
    
     
     

}
