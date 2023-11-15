package validation;
import exception.InvalidInputException;
import java.time.LocalDate;

import core.Student;
import core.coursename;

public class Studentvalidation {
	public static LocalDate checkdob(String dob) throws InvalidInputException {
		LocalDate cur_date = LocalDate.parse(dob);
		LocalDate dt=LocalDate.of(1985, 01, 01);
		if(cur_date.isBefore(dt))
			throw new InvalidInputException("You are too old");
		return cur_date;
		}
	
	public static coursename checkcourse(String cname) throws IllegalArgumentException {
		
		return coursename.valueOf(cname);
	}
	public static Student validateall(String prn, String fname, String lname,String cname, String dob) throws InvalidInputException,IllegalArgumentException {
		System.out.println("inside the validateall -s");
		String s=cname.toUpperCase();
		LocalDate dt=checkdob(dob);
		coursename cname1=checkcourse(s);
		System.out.println("inside the validateall --e");
		return new Student(prn,fname,lname,cname1,dt);
		
		
	}

}
