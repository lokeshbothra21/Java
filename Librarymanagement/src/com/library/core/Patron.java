package com.library.core;

import java.time.LocalDate;

public class Patron implements Comparable{
//	Attributes: Patron ID (int), First Name (String), Last Name (String), Email (String), Phone Number (String), Registration Date (LocalDate).
	private int Patron_ID;
	private String FirstName;
	private String LastName;
	private String Email,phonenumber;
	LocalDate RegistrationDate;
	public Patron(int patron_ID, String firstName, String lastName, String email, String phonenumber,
			LocalDate registrationDate) {
		super();
		Patron_ID = patron_ID;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		this.phonenumber = phonenumber;
		RegistrationDate = registrationDate;
	}
	@Override
	public String toString() {
		return "Patron [Patron_ID=" + Patron_ID + ", FirstName=" + FirstName + ", LastName=" + LastName + ", Email="
				+ Email + ", phonenumber=" + phonenumber + ", RegistrationDate=" + RegistrationDate + "]";
	}
	public int getPatron_ID() {
		return Patron_ID;
	}
	public void setPatron_ID(int patron_ID) {
		Patron_ID = patron_ID;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public LocalDate getRegistrationDate() {
		return RegistrationDate;
	}
	public void setRegistrationDate(LocalDate registrationDate) {
		RegistrationDate = registrationDate;
	}
	@Override
	public int hashCode() {
		return ((Integer)this.Patron_ID).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Patron)                                                                                                        return this.Patron_ID==((Patron)obj).Patron_ID;
			return false;
		
	}
	@Override
	public int compareTo(Object o) {
		return ((Integer)this.Patron_ID).compareTo(((Patron)o).Patron_ID);
		
	}
	
	
}
