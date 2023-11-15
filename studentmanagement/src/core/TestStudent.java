// String prn, String fname, String lname,coursename cname, LocalDate dob

package core;

import static validation.Studentvalidation.validateall;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import validation.*;
import static validation.Checkprn.checkbyprn;

public class TestStudent {

	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {

			List<Student> clist = new ArrayList<Student>();

			boolean exit = true;
			try {
				     while (exit)
				     {
				    	 System.out.println("Enter 1.add 2.show 3.find by prn");
				    	    switch(sc.nextInt())
				    	    {
				    	    case 1:
				    	    	System.out.println("Enter studetn details");
				    	    	Student s1=Studentvalidation.validateall(sc.next(), sc.next(), sc.next(), sc.next(),sc.next());
				    	         System.out.println(s1);
				    	         
				    	        	 clist.add(s1);
				    	         
				    	    break ;
				    	    case 2:
				    	    	System.out.println("Displaying Student Details...");
				    	    	for(Student i:clist)
				    	    	{
				    	    		System.out.println(i);
				    	    	}
				    	    	break;
				    	    case 3:
				    	    {
				    	    	System.out.println("Enter the PRN no : \n");
				    	    	String s=sc.next();
				    	    	Student s3=checkbyprn(s, clist);
				    	    	System.out.println(s3);
				    	    }
				    	    break;
				    	    }

				     }
			}
			catch (Exception e) 
			{
			    System.out.println(e.getMessage());
			}

		}

	}

}


