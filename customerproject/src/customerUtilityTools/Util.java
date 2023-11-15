package customerUtilityTools;



//import static tester.Customer_Testing.list;

import java.time.LocalDate;
import java.util.List;

import core.Customer;
import core.ServicePlan;
//import custom_exception.ValidateException;
import customeException.Validation_Customer;
public class Util {
//	public static Customer validateEntry(String email,List<Customer> clist) throws Validation_Customer {
//		Customer cust=new Customer(email);
//		
//		
//		if (clist.contains(cust)) {
//	     System.out.println("Signed in ");
//		
//		}throw new Validation_Customer("Email is incorrect");
//			
//	}
		
	public static Customer validateSignIn(String email,String password,List<Customer> clist) throws Validation_Customer {
	Customer cust=new Customer(email);
	if (clist.contains(cust)) {
		 int index=clist.indexOf(cust);
		 Customer check=clist.get(index);
		 if(password.equals(check.getPassword())) {
 	 return check;  
	
	}
		 }throw new Validation_Customer("Email is incorrect");
	}
	
	
	
	public static  void changePassword(String email,String password,String newPassword,List<Customer> clist) throws Validation_Customer {
		Customer cust=new Customer(email);
		if(clist.contains(cust)) {
		int	index=clist.indexOf(cust);
		Customer check=clist.get(index);
		if(password.equals(check.getPassword())) {
			System.out.println("Please Enter New Password");
			check.setPassword(newPassword);
			return;
		}
			
		}throw new Validation_Customer("Wrong credentials");
		} 

	
	 public static Customer unsubscribeCustomer(String email,List<Customer> list) throws Validation_Customer {
		  Customer cust=new Customer(email);		  
		  if(list.contains(cust)) {
			 int index=list.indexOf(cust);
			 Customer check=list.get(index);
		  list.remove(check);
		  return cust;
		  }
		  throw new Validation_Customer("Wrong input");
	  }
//	SILVER(100),
//	GOLD(500),
//	DIAMOND(1000),
//	PLATINUM(5000);
	public static void  fillData(List<Customer> list) {
		//System.out.println("start");
		list.add(new Customer("Abhijeet","Singh",LocalDate.parse("1998-02-28"),ServicePlan.GOLD,500,"abhijeet","abhi*",LocalDate.parse("2022-09-02")));
		list.add(new Customer("Loksh","Bothra",LocalDate.parse("1996-02-02"),ServicePlan.DIAMOND,1000,"lokesh","loki*",LocalDate.parse("2023-05-02")));
		list.add(new Customer("Abhishek","Singh",LocalDate.parse("1994-02-28"),ServicePlan.SILVER,100,"abhishek","abhi*",LocalDate.parse("2023-10-02")));
		list.add(new Customer("Abhimanyu","Singh",LocalDate.parse("1996-02-29"),ServicePlan.PLATINUM,5000,"abhimanyu","abhi*",LocalDate.parse("2023-06-02")));
		list.add(new Customer("Amit","Ramteke",LocalDate.parse("1996-02-29"),ServicePlan.PLATINUM,5000,"amit","amit*",LocalDate.parse("2023-03-02")));
		
	System.out.println("last");}
	
}
