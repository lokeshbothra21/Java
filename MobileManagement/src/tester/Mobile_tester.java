package tester;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import static utils.Mobile_validation.validatealldata;
import static utils.Mobile_utils.populateList;
import core.Mobile;
import core.Model;
import custom_exception.Mobile_Exception;

public class Mobile_tester {
	public static HashMap<Integer, Mobile> hp = new HashMap<>();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean exit = false;
		try {
			populateList();
			try {
				while (!exit) {
					System.out.println("--------Menu-------");
					System.out.println("1.Add Mobile 2.Display Mobile 3. Sort Mobile on the Basis of Mobile id"
							+ "4. Sort on Model year 0. exit");
					switch (sc.nextInt()) {
					case 1:// add mobile
						System.out.println("Enter details:name,company, price, mobileid, modelyear,	Model mdl,");
						Mobile m = validatealldata(sc.next(), sc.next(), sc.nextInt(), sc.nextInt(), sc.next(),
								sc.next());
						hp.put(m.getMobileid(), m);
						break;
					case 2:
						System.out.println("Displaying Mobiles");
						for (Mobile m1 : hp.values())
							System.out.println(m1);
						break;
					case 3:
						System.out.println("Sorting Mobiles");
						TreeMap<Integer, Mobile> t = new TreeMap<>(hp);
						for (Mobile m2 : t.values()) {
							System.out.println(m2);
						}
						break;
					case 4:
						System.out.println("Sorting on Model year:");
						ArrayList<Mobile> al = new ArrayList<>(hp.values());
						Collections.sort(al, new Comparator<Mobile>() {

							@Override
							public int compare(Mobile o1, Mobile o2) {
								int ret = ((Double) (o1.getPrice())).compareTo(o2.getPrice());
								if (ret == 0) {
									return o1.getModelyear().compareTo(o2.getModelyear());
								}
								return ret;
							}

						});

						break;
					case 0:
						exit = true;
						System.out.println("Exiting...");
						break;
					default:
						System.out.println("Default executed");
					}
				}
			} catch (Exception e) {
				throw new Mobile_Exception("Error");
			}

		} catch (Exception e) {
			e.getMessage();

		}

	}

}
