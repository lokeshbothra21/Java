package tester;

import java.time.LocalDate;
import java.time.Period;
//import java.util.ArrayList;
import java.util.*;

import core.Customer;
import core.ServicePlan;
import customeException.*;
import static customerUtilityTools.Util.validateSignIn;
//import static customerUtilityTools.Util.validateEntry;
import static customerUtilityTools.Util.changePassword;
import static customerUtilityTools.Util.unsubscribeCustomer;

import static customerUtilityTools.Util.fillData;
//import static customeException.Customer_Discrepency.validateAmount;
//import static customeException.Customer_Discrepency.validateAndParseDate;
//import static customeException.Customer_Discrepency.validatePlan;

import static customeException.Customer_Discrepency.centralizedValidation;

public class Customer_Testing {
	public static ArrayList<Customer> list = new ArrayList<>(); // To import outside the package:Declaring Static

	public static void main(String[] args) {
		// ArrayList<Customer> list = new ArrayList<>();
		boolean exit = false;

		try (Scanner sc = new Scanner(System.in)) {
			fillData(list);
			while (!exit) {
				System.out.println(
						"Please Enter  0.Exit 1.Adding Customer 2.DISPALY dATA 3.Customer Login 4:Change Password"
								+ " 5.Unsubscibe Customer 6.Sort Customer List W.r.t Email(PK) 7.Sort Customers w.r.t Date Of Birth "
								+ "8.Sort WRT DOB AND Email 9. Customers who havent paid bill past 3 months "
								+ "10.Remove Customers whose subscription has expired");

				try {
					switch (sc.nextInt()) {

					case 1:
						System.out.println("Your Selection :Adding Data");
						/*
						 * String fname, String lname, LocalDate dob, ServicePlan plan, double price,
						 * String email, LocalDate dateOfSubs
						 */
						System.out.println(
								"Please Enter Firstname ,Lastname,Dob,ServicePlan,Amount Paid,Email,Password,DateOfSubScription");

						list.add(centralizedValidation(sc.next(), sc.next(), sc.next(), sc.next(), sc.nextDouble(),
								sc.next(), sc.next(), sc.next()));
						// Example Format:Abhijeet Singh 1996-02-02 Gold 500 abhi#mail **** 2018-02-02
						break;
					case 2:
						System.out.println("Displaying Data ");
						for (Customer c : list) {
							System.out.println(c);
						}
						break;
					case 3:
//						System.out.println("Sign in Selected");
//						System.out.println("Enter email");
//						Customer cust=validateEntry(sc.next());
//						System.out.println("Success");
						System.out.println("Please Enter Email and Password");
						Customer cust = validateSignIn(sc.next(), sc.next(), List.copyOf(list));//CopyOf method is used to share the refrence of the list
						System.out.println("Successfully Logged in");

						break;
					case 4:
						System.out.println("Password change Selected ");
						System.out.println("pleasse Enter Email password and new Password");
						changePassword(sc.next(), sc.next(), sc.next(), List.copyOf(list));
						System.out.println("Password changed Successfully");
						break;
					case 5:
						System.out.println("Please Enter email");
						unsubscribeCustomer(sc.next(), list);
						System.out.println("Customer is Unsubuscribed ,Hope to see You Again");
					case 6:
						System.out.println("Selection:Sorting of list");
						Collections.sort(list);
						for (Customer totalList : list) {
							System.out.println(totalList);
						}
						break;

					case 7:
						System.out.println("Sorting via  dob and email");
						Collections.sort(list, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								LocalDate l1 = o1.getDob();
								LocalDate l2 = o2.getDob();

								return o1.getDob().compareTo(o2.getDob());

							}

						});

						break;
					case 8:// Current Modifiication Exception
						System.out.println("Srting via Dob And email");
						Collections.sort(list, new Comparator<Customer>() {

							@Override
							public int compare(Customer o1, Customer o2) {
								int ret = o1.getDob().compareTo(o2.getDob());
								if (ret == 0) {
									return o1.getLname().compareTo(o2.getLname());
								}
//								if (ret == 0) {
//									Collections.sort(list); //Current Modifiication Exception
//								}
								return ret;
							}

						}

						);

						break;
					case 9:
						System.out.println("Seletion : Customers who haven't paid bill past 3 months");
						for (Customer custo : list) {
							// Period timePeriods = Period.
							LocalDate dates = LocalDate.now();
							Period timePeriod = Period.between(custo.getDateOfSubs(), dates);
							if (timePeriod.getMonths() > 3 | timePeriod.getYears() >= 1)
								System.out.println(custo);

						}
						break;

					case 10:
						System.out.println(
								"List OF Customers whose Subscription has expired I.E Pending Past 6 months are");
						for (Customer custo : list) {
							LocalDate dates = LocalDate.now();
							Period validity = Period.between(custo.getDateOfSubs(), dates);
							if (validity.getMonths() > 6 | validity.getYears() >= 1) {
								System.out.println("The Customers are" + custo);
								list.remove(custo);
								System.out.println("Customers are removed From the list ");
							}
						}
						break;
					case 0:
						System.out.println("Exit Successful");
						exit = true;
						break;
					}
				} catch (Exception e) {
					sc.nextLine();
					System.out.println(e);
					// System.out.println(e.getLocalizedMessage());
					e.printStackTrace();
					e.getMessage();

				}

			}

		}

	}

}
