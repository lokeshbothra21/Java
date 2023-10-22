
public class Date {
private int day;
private int month;
private int year;

public void setDate(int d,int m,int y) {
	day=d;
	month=m;
	year=y;
}

public void displayDate() {
	System.out.print(day+"/"+month+"/"+year);

}

}
