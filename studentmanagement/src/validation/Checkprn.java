package validation;

import java.util.List;

import core.Student;

import exception.InvalidInputException;


public class Checkprn {
	
	public static Student checkbyprn(String prn,List<Student> clist) throws InvalidInputException
	{
		System.out.println("0");
		Student S1 =new Student(prn);
		System.out.println("1");
		int index =clist.indexOf(S1);
		System.out.println(index);
		if(index == -1)
			throw new InvalidInputException("Invalid ch no , Vehicle not found !!!!");
		System.out.println(clist.get(index));
		return S1;
		
        
	
		
	}
}


