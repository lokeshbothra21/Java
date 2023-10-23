package com.code;

public class Date {
private  int day,month,year;

public Date(int day, int month, int year) {
	super();
	this.day = day;
	this.month = month;
	this.year = year;
}

public Date() {
	super();
	this.day=1;
	this.month=1;
	this.year=1990;
}

@Override
public String toString() {
	return "Date:" + day + "/" + month + "/" + year ;
}

 

}
