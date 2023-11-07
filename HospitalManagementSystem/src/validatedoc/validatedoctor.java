package validatedoc;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.core.Department;
import com.core.Doctor;

import docexception.Docust;

public class validatedoctor
{
	
	
	public static void validateemail(String email,Map<String,Doctor> cmap) throws Docust
	{
		if(cmap.containsKey(email))
		throw new Docust("Please enter the valid email...");
		String s="^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
	   if(!(email.matches(s)))
		 throw new Docust("email pattern mismatch....");
	   
		
	}
	
	public static LocalDate checkdate(String date) throws Docust
	{
		  LocalDate p=LocalDate.of(2011, 05, 10);
		  LocalDate d=LocalDate.parse(date);
		  if(d.isBefore(p))
			  throw new Docust("Pleaase enter the date after given timestamp...");
		  return d;
	}
	
	
	public static Department checkdept(String dept) throws IllegalArgumentException
	{
		 Department dname=Department.valueOf(dept.toUpperCase());
		 return dname;
	}
	   

  public static void ceheckdegree(Department dept,Map<String,Doctor> cmap)
  {
	   List<Doctor> dlist=new ArrayList<>();
		dlist=cmap.values().stream().filter(s->s.getDept()==Department.ORTHO).collect(Collectors.toList());
		dlist.forEach(s->s.setSalary(s.getSalary()*1.2));
		
  }

	
	
	public static Doctor validateall(int docid,String dname,String email,String degree,double salary,String date,int exp,String dept,Map<String,Doctor> cmap) throws Docust
	{
		validateemail(email,cmap);
		LocalDate newd=checkdate(date);
		Department newdept=checkdept(dept);
		
		return new Doctor(docid,dname,email,degree,salary,newd,exp,newdept);
	}
	

}
//int docid, String dname, String email, String degree, double salary, LocalDate joining,
//int experience, Department dept