package utils;

import java.util.Map;

import com.core.Doctor;

public class findbysalary {
	
	public static Doctor findsal(Map<String,Doctor> cmap)
	{
		 Doctor c=cmap.values().stream().max((p1,p2)->((Double)p1.getSalary()).compareTo(p2.getSalary())).orElseThrow();
				 
		return c;
	}

}
