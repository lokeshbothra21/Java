package core;

import java.time.LocalDate;

public class Customer implements Comparable<Customer> {
	String fname;
	String lname;
	LocalDate dob;
	ServicePlan plan; 
	double price;
	String email;
	String password;
	LocalDate dateOfSubs;
	//boolean isAvilable=false;
	

public Customer(String email) {
	super ();
	this.email=email;
}

public boolean equals(Object o) {
	if(o instanceof Customer) {
		Customer s=(Customer)o; //Downcasting
		return this.email.equals(s.email);	
		}
	return false;
}

public Customer(String fname, String lname, LocalDate dob, ServicePlan plan, double price, String email,
		String password, LocalDate dateOfSubs) {
	super();
	this.fname = fname;
	this.lname = lname;
	this.dob = dob;
	this.plan = plan;
	this.price = price;
	this.email = email;
	this.password = password;
	this.dateOfSubs = dateOfSubs;
}

public String getFname() {
	return fname;
}

public void setFname(String fname) {
	this.fname = fname;
}

public String getLname() {
	return lname;
}

public void setLname(String lname) {
	this.lname = lname;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

public ServicePlan getPlan() {
	return plan;
}

public void setPlan(ServicePlan plan) {
	this.plan = plan;
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public LocalDate getDateOfSubs() {
	return dateOfSubs;
}

public void setDateOfSubs(LocalDate dateOfSubs) {
	this.dateOfSubs = dateOfSubs;
}

@Override                     //Method Of Object Class
public String toString() {
	return "Customer [fname=" + fname + ", lname=" + lname + ", dob=" + dob + ", plan=" + plan + ", price=" + price
			+ ", email=" + email + ", password=" + password + ", dateOfSubs=" + dateOfSubs + "]";
}

@Override                       //Method Of Comparable Interface
public int compareTo(Customer o) {
	// TODO Auto-generated method stub
	return this.email.compareTo(o.email);
}


}

