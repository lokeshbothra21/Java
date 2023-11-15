package validateExceptions;
import static tester.testCustomer.map;

import java.time.LocalDate;

import com.app.core.Customer;
import com.app.core.Plan;

import custom_exception.MessException;
public class validateCustomer {
       public static void validateDup(String email) throws MessException {
    	   if(map.containsKey(email)) {
    		   throw new MessException("Duplicate Email");
    	   }
       }
        public static void validateEmail(String email) throws MessException {
        	String pattern="[A-Z0-9a-z._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}";
        	if(!email.matches(pattern)) {
        		throw new MessException("Invalid Email");
        	}
        }
        public static void validateAmount(Plan pla,double amount) throws MessException {
        	if(! (pla.getPamount()==amount)){
        		throw new MessException("Plan amount not matched");
        	}
        }
        public static LocalDate validatePlanEndDate(Plan pla,LocalDate regDate) {
        	LocalDate planEndDate=null;
        	if(pla.equals(Plan.MONTHLY)) {
        		 planEndDate=regDate.plusMonths(1);
        	}
        	if(pla.equals(Plan.QUARTERLY)) {
        		 planEndDate=regDate.plusMonths(3);
        	}
        	if(pla.equals(Plan.YEARLY)) {
        		 planEndDate=regDate.plusMonths(12);
        	}
        	if(pla.equals(Plan.HALFYEAR)) {
        		 planEndDate=regDate.plusMonths(6);
        	}
        	return planEndDate;
        	
        }
        public static void validateMob(String mob) throws MessException {
//        	String pat="[0-9]";
//        	if(mob.length()!=10 && !mob.matches(pat)) {
//        		throw new MessException("Invalid Mobile Number");
//        	}
        	String s="^\\d{10}$";
    		if(!mob.matches(s))
    		 throw new MessException("no acceptable phone no...");
        	
        }
        public static Customer validateAll(String firstname, String lastname, String email, String password, String address,
    			String phoneNo,String pl, double amount) throws MessException {
        	validateDup(email);
        	validateEmail(email);
        	Plan plan=Plan.valueOf(pl.toUpperCase());
        	validateAmount(plan,amount);
        	LocalDate regDate=LocalDate.now();
        	LocalDate planEndDate=validatePlanEndDate(plan,regDate);
        	validateMob(phoneNo);
//        	String firstname, String lastname, String email, String password, String address,
//			String phoneNo,  LocalDate planEndDate, Plan pl, double amount
        	return new Customer(firstname,lastname,email,password,address,phoneNo,regDate,planEndDate,plan,amount);
        	
        	
        }
}
