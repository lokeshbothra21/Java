package utils;

import java.time.LocalDate;

import com.iacsd.core.Color;
import com.iacsd.core.Vehicle;

import custom_exceptions.InvalidInputException;

public class ShowroomValidations {
//add a method to parse n validate color
	public static Color parseAndValidateColor(String clr) throws InvalidInputException // optional
	{
		try {
		return Color.valueOf(clr.toUpperCase());
		}catch(IllegalArgumentException e) {
			throw new InvalidInputException("Invalid color");// throws IllegalArgumentExc
		}
	}

	// add a method to parse n validate manu. date : after 1st Jan 2022
	public static LocalDate parseAndValidateDate(String date) throws InvalidInputException {
		// parsing
		LocalDate manuDate = LocalDate.parse(date);
		// parsing success --> validations
		LocalDate checkDate = LocalDate.of(2022, 1, 1);
		if (manuDate.isBefore(checkDate))
			throw new InvalidInputException("Manu date must be after 1st Jan 2022");
		return manuDate;
	}

	// add a method to validate all i/ps
	public static Vehicle validateAllInputs(String chasisNo, String vehicleColor, double price, String manufactureDate,
			String company) throws IllegalArgumentException, InvalidInputException {
		Color color = parseAndValidateColor(vehicleColor);
		LocalDate validatedDate = parseAndValidateDate(manufactureDate);
		//=> i/ps are valid
		return new Vehicle(chasisNo, color, price, validatedDate, company);
	}
}


//vehicle v = 