package utils;

import static tester.Mobile_tester.hp;

import java.time.LocalDate;

import core.Mobile;
import core.Model;

public class Mobile_utils {
	 public static void populateList() {
  	   hp.put(34, new Mobile("LaLa","Googly",100000, 34, LocalDate.parse("2001-02-01"),Model.MSERIES));
  	   hp.put(35, new Mobile("LaLii","BlackBerry",100000, 35, LocalDate.parse("1996-02-01"),Model.SSERIES));
  	   hp.put(36, new Mobile("LaLu","Xolo",700000, 35, LocalDate.parse("2001-02-01"),Model.XSERIES));
  	   
   }

}
