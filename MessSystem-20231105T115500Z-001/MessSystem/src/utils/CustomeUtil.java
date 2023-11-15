package utils;
import static tester.testCustomer.map;

import java.time.LocalDate;
import java.util.Scanner;

import com.app.core.Customer;
import com.app.core.Plan;

import custom_exception.MessException;
public interface CustomeUtil {
   
	 public static void populateCustomer() {
		 map.put("gopal@sangwe",new Customer("gopal","sangwe","gopal@sangwe","gopu","latur","7894234224",LocalDate.now(),LocalDate.now().plusMonths(1),
				 Plan.MONTHLY,3000));
		 map.put("rohit@bhuyar",new Customer("rohit","bhuyar","rohit@bhuyar","rohu","akurdi","8894234224",LocalDate.of(2023,11,7),LocalDate.of(2023,11,7).plusMonths(6),
				 Plan.YEARLY,32000));
		 map.put("vishwa@bhuyar",new Customer("rohit","bhuyar","vishwa@bhuyar","piu","akurdi","8894234224",LocalDate.of(2023,01,5),LocalDate.of(2023,01,5).plusMonths(3),
				 Plan.QUARTERLY,11700));
		 
	 }
	 public static void signIn(String email,String pass) throws MessException {
		 if(map.containsKey(email)) {
			 Customer c=map.get(email);
			 if(c.getPassword().equals(pass)){
				 System.out.println("Welcome");
			 }else {
				 throw new MessException("Incorrect Password");
			 }
			 
		 }else {
			 throw new MessException("Incorrect Email");
		 }
	 }
	 public static void changePassword(String email,String pass,Scanner sc) throws MessException {
		   if(map.containsKey(email)) {
			  Customer c=map.get(email);
			  if(c.getPassword().equals(pass)) {
				  System.out.println("Enter new Password");
				  c.setPassword(sc.next());
				  System.out.println("Password Changed Successfully");
			  }
		   }else {
			   throw new MessException("Not Present");
		   }
	 }
}
