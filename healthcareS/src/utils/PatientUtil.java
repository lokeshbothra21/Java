package utils;
import static tester.Test.map;

import java.time.LocalDate;

import com.health.core.Healthcare;
import com.health.core.room;
public class PatientUtil {
	public static void populatedate() {
//		int sNo, String pName, int age, String gender, String address, String phoneNo, String disease,
//		LocalDate admitdate, double bill, double annualincome, room roomtype
	map.put(1,new Healthcare(1, "lokesh", 28, "male", "bikaner", "85048108","fever",LocalDate.now(),10000.00,1500000.00,room.GENERAL));
	map.put(2,new Healthcare(2, "raja", 21, "male", "bikaner", "85048108","fever",LocalDate.now(),20000.00,3000000.00,room.SEMISPECIAL));
	map.put(3,new Healthcare(3, "rani", 18, "female", "bikaner", "85048108","fever",LocalDate.now(),50000.00,5000000.00,room.SPECIAL));
	map.put(2,new Healthcare(2, "raja", 21, "male", "bikaner", "85048108","fever",LocalDate.now(),20000.00,3000000.00,room.ICU));
	}

}
