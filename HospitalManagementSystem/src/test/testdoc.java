package test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import com.core.Department;
import com.core.Doctor;

public class testdoc {

	public static void main(String[] args) 
	{
		Map<String,Doctor> cmap=new HashMap<>();
		System.out.println("----------Hospital Management System---------------");
		try(Scanner sc=new Scanner(System.in))
		{
			boolean exit=true;
			while(exit)
			{
			System.out.println("Enter Choice 1. 2. 3. ");
			
			try
			{
			  switch(sc.nextInt())
			  {
			  case 1://add doctor --->int docid,String dname,String email,String degree,double salary,String date,int exp,String dept,Map<String,Doctor> cmap
				  Doctor d=validatedoc.validatedoctor.validateall(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.next(),sc.nextInt(),  sc.next(), cmap);
				  cmap.put(d.getEmail(), d);
				  break;
			  case 2://display
				  cmap.values().stream().forEach(System.out::println);
				  
				  break;
			  case 3://
				  cmap.values().stream().sorted((p1,p2)->((Integer)p1.getExperience()).compareTo(p2.getExperience())).forEach(s->System.out.println(s));
				  break;
				  
			  case 4:
				  cmap.values().stream().sorted((p1,p2)->{int index=((Double)p1.getSalary()).compareTo(p2.getSalary());
				  if(index==0) // agar salary barabar hai toh check karo experience se
			     return ((Integer)p1.getExperience()).compareTo(p2.getExperience());
				  return index;}).forEach(s->System.out.println(s));
				  break;
			  case 5://highest salary
				  Doctor c=utils.findbysalary.findsal(cmap);
				  System.out.println(c);
				  
				  break;
				  
			  case 6://ortho 
				  cmap.values().stream().filter(p1->p1.getDept()==Department.ORTHO).forEach(s->System.out.println(s));
				  break;
			  case 7://serialisation
				  utils.binarycust.encodebinary(cmap, "abhijeet.ser");
				  System.out.println("file has been saved...");
				  break;
				 
			  case 8://deserialisation
				  Map<String,Doctor> newmap=new HashMap<>();
				  newmap=utils.binarycust.decodebinary("abhijeet.ser");
				  newmap.values().stream().forEach(s->System.out.println(s));
				  break;
			  case 9://write char 
				  utils.binarycust.writecharfile(cmap, "lokesh.txt");
				  break;
			  case 10://read file
				  utils.binarycust.readcharfile("lokesh.txt");
				  break;
			  case 0:
				  exit=false;
				  break;
				  
			  }
			}catch(Exception e)
			{
				sc.nextLine();
				System.out.println(e.getMessage());
			}
			}
		}
		
		

	}

}
