package tester;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import static utils.IOUtil.storeBin;
import static utils.IOUtil.readBin;
import static utils.CustomeUtil.*;
import static utils.CustomeUtil.populateCustomer;
import static validateExceptions.validateCustomer.*;
import com.app.core.Customer;
import com.app.core.Plan;

import java.util.ArrayList;
import java.util.Comparator;

public class testCustomer {
	public static Map<String, Customer> map = new HashMap<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			populateCustomer();

			boolean exit = false;
			while (!exit) {
				System.out.println("0.Exit" + "1. Sign up Customer\r\n" + "2. If already register then sign in\r\n"
						+ "3. Change Password  \r\n" + ". Sort Customer as pe" + "4. First name \r\n"
						+ "5. According to plan\r\n" + "6. According to date of registration\r\n"
						+ "(Imperative/Declarative way)\r\n"
						+ "7. Unsubscribe customer according plan duration (month wise (1, 3, 6, 12))\r\n"
						+ "8. Display all Customers\r\n"
						+ "9. Modify all customers first name (make first Letter capital of customers first name)\r\n"
						+ "10. Display email addresses of the customers who did registration in month of January\r\n"
						+ "11. Display count of the Customers who have register for plan: Monthly\r\n"
						+ "12. Search the Customer who lived in Akurdi.\r\n"
						+ "13. Give the 20% discount to the customers who have selected plan for 1 year."
						+"14.Serilizable"
						+"15.Deserilizable");
				try {
					switch (sc.nextInt()) {
					case 0:
						exit = true;
						break;
					case 1:
						System.out.println("1.Sign up Customer");
//        			String firstname, String lastname, String email, String password, 
						// String address,
//        			String phoneNo,String pl, double amount
						System.out.println("Enter FirstName,LastName,Email,Password,Address" + "phoneNo,Plan,amount");
						Customer c = validateAll(sc.next(), sc.next(), sc.next(), sc.next(), sc.next(), sc.next(),
								sc.next(), sc.nextDouble());
						map.put(c.getEmail(), c);
						System.out.println("Stored Details in Map");
						break;
					case 2:
						System.out.println("1.Sign In");
						System.out.println("Enter Email and Password");
						signIn(sc.next(), sc.next());
						System.out.println("Successfully Signed In");
						break;
					case 20:
						System.out.println("Display");
						map.values().stream().forEach(p -> System.out.println(p));
						break;
					case 3:
						System.out.println("Change Password");
						System.out.println("Enter Email and Password");
						changePassword(sc.next(), sc.next(), sc);
						break;
					case 4:
						System.out.println("Sort As per FirstName");
						Comparator<Customer> comp = (s1, s2) -> s1.getFirstname().compareTo(s2.getFirstname());
						map.values().stream().sorted(comp).forEach(p -> System.out.println(p));
						break;
					case 5:
						System.out.println("Sort as Per Plan");
						Comparator<Customer> cust = (s1, s2) -> s1.getPl().compareTo(s2.getPl());
						map.values().stream().sorted(cust).forEach(p -> System.out.println(p));
						break;
					case 6:
						System.out.println("Sort as per regDate");
						Comparator<Customer> co = (s1, s2) -> s1.getRegisDate().compareTo(s2.getRegisDate());
						map.values().stream().sorted(co).forEach(p -> System.out.println(p));
						break;
					case 7:
						System.out.println("Enter Months");
						int months=sc.nextInt();
						List<Customer> custList=new ArrayList<>(map.values());
					for(Customer s:custList) {
						if(months==1) {
						  if(s.getPl().equals(Plan.MONTHLY)) {
							  String email=s.getEmail();
									 
							  map.remove(email);
						  }
						}
						if(months==3) {
							  if(s.getPl().equals(Plan.QUARTERLY)) {
								  String email=s.getEmail();
										 
								  map.remove(email);
							  }
							}
						if(months==6) {
							  if(s.getPl().equals(Plan.HALFYEAR)) {
								  String email=s.getEmail();
										 
								  map.remove(email);
							  }
							}
						if(months==12) {
							  if(s.getPl().equals(Plan.YEARLY)) {
								  String email=s.getEmail();
										 
								  map.remove(email);
							  }
							}
						
					}
						break;
					case 8:
						System.out.println("Displaying Details");
						map.values().stream().forEach(p -> System.out.println(p));
						break;
					case 9:
						System.out.println("Changing FirstName");
						for (Customer c1 : map.values()) {
							String fname = c1.getFirstname();
							String nfname = "";
							nfname = nfname.concat(fname.substring(0, 1).toUpperCase() + fname.substring(1));
							c1.setFirstname(nfname);
						}
						break;
					case 10:System.out.println("Display email addresses of the "
							+ "customers who did registration in month of January");
					       map.values().
					       stream().
					       filter(p->p.getRegisDate().getMonthValue()==1).
					       forEach(p->System.out.println(p.getEmail()));
					       break;
					case 11:System.out.println("Count Monthly");
					      long count=map.values().stream().filter(p->p.getPl().equals(Plan.MONTHLY)).count();
					      System.out.println(count);
					      break;
					case 12: System.out.println("Search the Customer who lived in Akurdi");
					  map.values().stream().filter(p->p.getAddress().equals("akurdi")).forEach(p->System.out.println(p));
					  break;
					case 13:System.out.println("Give the 20% discount to the customers "
							+ "who have selected plan for 1 year");
					List<Customer> plans = map.values().stream()
					        .filter(p -> p.getPl().equals(Plan.YEARLY))
					        .peek(p -> p.setAmount(p.getAmount() * 0.8)) // Use peek to perform an operation without changing the stream
					        .collect(Collectors.toList());
					plans.forEach(p->System.out.println(p));
					break;
					case 14:System.out.println("Serilizable");
				          System.out.println("Enter filename");
				          sc.nextLine();
				          storeBin(sc.nextLine());
				          break;
					case 15:System.out.println("Deserilizable");
					      System.out.println("Enter Filename");
					      sc.nextLine();
					      System.out.println(readBin(sc.nextLine()));
					      break;
					}
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
	}

}
