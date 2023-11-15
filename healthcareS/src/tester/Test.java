package tester;

import static utils.PatientUtil.populatedate;
import static validations.validation.validateALL;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.health.core.Healthcare;
import com.health.core.room;

public class Test {
	public static Map<Integer, Healthcare> map = new HashMap<>();

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			populatedate();
			boolean flag = true;
			while (flag) {
				try {
					System.out.println(
							"Enter choice:1.add records 2.display details 3.Annual income greater than 30000 4.display details of user input choosen 5.remove users who has diabetese 6.display all the patients who’s age  >75. 7.display all the patients who’s age  >75. 8.Sort the patients based on gender. 0.exit");
					switch (sc.nextInt()) {
					case 1:
						// add records
//						int sNo, String pName, int age, String gender, String address, String phoneNo, String disease,String admitdate, double bill, double annualincome, String roomtype
						Healthcare h = validateALL(sc.nextInt(), sc.next(), sc.nextInt(), sc.next(), sc.next(),
								sc.next(), sc.next(), sc.next(), sc.nextDouble(), sc.nextDouble(), sc.next());
						map.put(h.getsNo(), h);
						break;
					case 2:
						map.values().stream().forEach(s -> System.out.println(s));
						break;
					case 3:
						map.values().stream().filter(s1 -> s1.getAnnualincome() > 30000)
								.forEach(p -> System.out.println(p));
						break;
					case 4:
						room rooms = room.valueOf(sc.next().toUpperCase());

						map.values().stream().filter(s1 -> s1.getRoomtype().equals(rooms))
								.forEach(s -> System.out.println(s));
						break;

					case 5:
						List<Healthcare> custList = new ArrayList<>(map.values());

						for (Healthcare h1 : custList) {

							if (h1.getDisease().equals("DIABETESE")) {
								int sn = h1.getsNo();
								map.remove(sn);
							}
						}

						break;
					case 6:
						room r1 = room.valueOf("ICU");
						for (Healthcare h2 : map.values()) {
							if (h2.getRoomtype().equals(r1)) {
								h2.setRoomtype(room.SPECIAL);
							}

						}
						break;
					case 7:
						map.values().stream().filter(s1 -> s1.getAge() > 75).forEach(p -> System.out.println(p));
						break;
					case 8:
						map.values().stream().sorted((s1, s2) -> s1.getGender().compareTo(s2.getGender()))
								.forEach(s -> System.out.println(s));
						break;

					case 0:
						flag = false;
						break;

					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

		}

	}

}
