package com.code;

public class Student extends Person {

		private int rollno;
		private String qua;
		private double per;
		
		public Student() {
			System.out.println("Default cons called");
		}
		
		public Student(int rollno,int age,String name,String city,String qua,double per) {
			super(age,name,city); //doubt -- value ulta le rha hai
			this.rollno=rollno;
			this.qua=qua;
			this.per=per;
			
		}
		@Override
		public String Showdata() {
			
			return super.Showdata()+" "+rollno+" "+qua+" "+per;
		}
		
		public void Stud() {
			
			System.out.println("Student class method");
		}
}
