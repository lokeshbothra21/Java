package utils;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import com.library.core.Book;
import com.library.core.Patron;
import com.library.core.Transaction;

public class LibraryUtility {
      public static Map<Integer,Transaction> populateMap(){
    	  Map<Integer,Transaction> map=new HashMap<>();
    	  //int transId, int quantity, Patron pId, LocalDate date, double totalPrice, Book iSBN
    	  //Patron(int patron_ID, String firstName, String lastName, String email, String phonenumber,
			//LocalDate registrationDate)
    	      // map.put(1, new Transaction(1,10,new Patron(1,Ram,)))
      }
}
