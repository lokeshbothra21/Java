package customeException;


import java.time.*;



import core.Customer;
import core.ServicePlan;
//import customeException.*;
import static tester.Customer_Testing.list; //List is imported was declared static while creation 

public class Customer_Discrepency {
	public static Customer validateSignin(String email,String password ) {
		Customer cust=new Customer(email);
		
		return cust;
	}

	public static LocalDate validateAndParseDate(String date) throws Validation_Customer {
		LocalDate validDob=LocalDate.of(1950, 01, 01);
		LocalDate dateNew=LocalDate.parse(date);
		if(dateNew.isBefore(validDob)) {
			
		
			throw new Validation_Customer("Birthdate not valid");}
		
		return dateNew;
	}
	
	
	public static ServicePlan validatePlan(String plan) throws IllegalArgumentException{
		return ServicePlan.valueOf(plan.toUpperCase());
		
	}
	
	public static double validateAmount(ServicePlan plan,double amount) throws Validation_Customer{
	if(plan.getAmount()!=amount) 
		throw new Validation_Customer("Wrong plan Selected");
	
		
		return amount;
	}
	
//		public Customer(String fname, String lname, LocalDate dob, ServicePlan plan, double price, String email,
//				LocalDate dateOfSubs/*, boolean isAvilable*/) 
	public static String ValidateEmail(String email) throws Validation_Customer {
        Customer c = new Customer(email);
	  
		  if(list.contains(c)) {
			  throw new Validation_Customer("Duplicate Email Already Exist");
		  }
	  
 
 return email;
}


public static Customer centralizedValidation
(String fname,String lname,String dob,String sp,double price,String email,String password,String subDate) throws IllegalArgumentException,Validation_Customer {
	LocalDate vdate=validateAndParseDate(dob);//Validating the date 
	LocalDate psubDate=LocalDate.parse(subDate);//Subcription Date parsed from String to Date 
	ServicePlan service=validatePlan(sp);
	double bd=validateAmount(service, price);
	String vemail=ValidateEmail(email);
	
	return new Customer(fname,lname,vdate,service,bd,vemail,password,psubDate);
}

}
