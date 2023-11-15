package validations;

import java.time.LocalDate;

import com.health.core.Healthcare;
import com.health.core.room;

import customexception.Healthcareexception;

public class validation {
	public static room validateroom(String type) {
		return room.valueOf(type.toUpperCase());

	}
	
	public static LocalDate checkDate(String date) throws Healthcareexception {
		LocalDate date2=LocalDate.now();
		LocalDate date1=LocalDate.parse(date);
		if(!(date1.equals(date2)))
			throw new Healthcareexception("invalid date");
		return date1;
	}
	
	public static void validateAmount(room price,double amount) throws Healthcareexception {
		if(!(price.getPrice()==amount))
			throw new Healthcareexception("Plan amount not matched");
	}
	
	public static Healthcare validateALL(int sNo, String pName, int age, String gender, String address, String phoneNo, String disease,String admitdate, double bill, double annualincome, String roomtype) throws Healthcareexception {
		validateroom(roomtype);
		LocalDate dat=checkDate(admitdate);
		room roo=room.valueOf(roomtype);
		validateAmount(roo, bill);
		return new Healthcare( sNo,  pName,  age,  gender,  address,  phoneNo,  disease,
				 dat,  bill,  annualincome, roo);
		
		
		
	}
}

