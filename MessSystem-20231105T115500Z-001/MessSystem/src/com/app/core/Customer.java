package com.app.core;

import java.io.Serializable;
import java.time.LocalDate;

public class Customer implements Serializable{
//	Customer id(int) , first name(String), 
//	last name (String), email(String), 
//	password(String), Address String, RegisterDate(LocalDate), planEndDate(LocalDate), 
//	Address(String), Phone No(String),plan Enum, final_amount double
	public static int sid;
	private int id;
	private String firstname,lastname,email,password,address,phoneNo;
	private LocalDate regisDate,planEndDate;
	private Plan pl;
	private double amount;
	static {
		sid=1;
	}
	public Customer(String firstname, String lastname, String email, String password, String address,
			String phoneNo, LocalDate regisDate, LocalDate planEndDate, Plan pl, double amount) {
		super();
		this.id = sid++;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.address = address;
		this.phoneNo = phoneNo;
		this.regisDate = regisDate;
		this.planEndDate = planEndDate;
		this.pl = pl;
		this.amount = amount;
	}
	public static int getSid() {
		return sid;
	}
	public static void setSid(int sid) {
		Customer.sid = sid;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		address = address;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", password=" + password + ", address=" + address + ", phoneNo=" + phoneNo + ", regisDate="
				+ regisDate + ", planEndDate=" + planEndDate + ", pl=" + pl + ", amount=" + amount + "]"+"\n";
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public LocalDate getRegisDate() {
		return regisDate;
	}
	public void setRegisDate(LocalDate regisDate) {
		this.regisDate = regisDate;
	}
	public LocalDate getPlanEndDate() {
		return planEndDate;
	}
	public void setPlanEndDate(LocalDate planEndDate) {
		this.planEndDate = planEndDate;
	}
	public Plan getPl() {
		return pl;
	}
	public void setPl(Plan pl) {
		this.pl = pl;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
}
