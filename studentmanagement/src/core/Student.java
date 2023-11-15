package core;

import java.time.LocalDate;

public class Student {
	private String prn;
	private String fname;
	private String lname;
	coursename cname;
	LocalDate dob;
	boolean confirm=false;
	
	public Student(String prn, String fname, String lname,coursename cname, LocalDate dob) {
		super();
		this.prn = prn;
		this.fname = fname;
		this.cname=cname;
		this.confirm=true;
		this.lname = lname;
		this.dob = dob;
		this.confirm = confirm;
	}
	public Student(String prn)
	{
		this.prn=prn;
	}
	
	
	
	@Override
	public String toString() {
		return "Student [prn=" + prn + ", fname=" + fname + ", lname=" + lname + ", cname=" + cname + ", dob=" + dob
				+ ", confirm=" + confirm + "]";
	}



	public boolean equals(Object o) {
		if(o instanceof Student)
			return this.prn==((Student)o).prn;
		return false;
	}
	


}
