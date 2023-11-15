package utils;

import java.time.LocalDate;
import static tester.Mobile_tester.hp;
import core.Mobile;
import core.Model;
import custom_exception.Mobile_Exception;

public class Mobile_validation {

	public static Mobile validatealldata(String name, String company, int price, int mobileid, String modelyear,
			String mdl) throws Mobile_Exception, IllegalArgumentException {
		LocalDate date = LocalDate.parse(modelyear);
		Model product = Model.valueOf(mdl);
		validateKey(mobileid);
		return new Mobile(name, company, price, mobileid, date, product);
	}

	private static void validateKey(int mobileid) throws Mobile_Exception {
		if (hp.containsKey(mobileid)) {
			throw new Mobile_Exception("Duplicate Mobile Id");
		}

	}

}
