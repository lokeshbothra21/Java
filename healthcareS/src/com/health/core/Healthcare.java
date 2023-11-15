package com.health.core;

import java.time.LocalDate;

public class Healthcare {
	private int sNo;
	private String pName;
	private int age;
	private String gender;
	private String address, phoneNo, disease;
	LocalDate admitdate;
	private double bill, annualincome;
	room roomtype;

	public Healthcare(int sNo, String pName, int age, String gender, String address, String phoneNo, String disease,
			LocalDate admitdate, double bill, double annualincome, room roomtype) {
		super();
		this.sNo = sNo;
		this.pName = pName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNo = phoneNo;
		this.disease = disease;
		this.admitdate = admitdate;
		this.bill = bill;
		this.annualincome = annualincome;
		this.roomtype = roomtype;
	}

	@Override
	public String toString() {
		return "Healthcare [sNo=" + sNo + ", pName=" + pName + ", age=" + age + ", gender=" + gender + ", address="
				+ address + ", phoneNo=" + phoneNo + ", disease=" + disease + ", bill=" + bill + ", annualincome="
				+ annualincome + ", roomtype=" + roomtype + "]";
	}

	public int getsNo() {
		return sNo;
	}

	public void setsNo(int sNo) {
		this.sNo = sNo;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public LocalDate getAdmitdate() {
		return admitdate;
	}

	public void setAdmitdate(LocalDate admitdate) {
		this.admitdate = admitdate;
	}

	public double getBill() {
		return bill;
	}

	public void setBill(double bill) {
		this.bill = bill;
	}

	public double getAnnualincome() {
		return annualincome;
	}

	public void setAnnualincome(double annualincome) {
		this.annualincome = annualincome;
	}

	public room getRoomtype() {
		return roomtype;
	}

	public void setRoomtype(room roomtype) {
		this.roomtype = roomtype;
	}

	@Override
	public boolean equals(Object o) {
		if (o instanceof Healthcare)
			return this.sNo == ((Healthcare) o).sNo;
		return false;
	}

}
