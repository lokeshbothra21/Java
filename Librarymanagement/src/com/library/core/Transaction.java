package com.library.core;

import java.time.LocalDate;

public class Transaction {
//	Attributes: Transaction ID (int), Patron ID (int), ISBN (String),
	//Transaction Date (LocalDate), Quantity (int), Total Price (double).

	private int transId,quantity;
	private Patron pId;
	private LocalDate date;
	private double totalPrice;
	private Book ISBN;
	
	public Book getISBN() {
		return ISBN;
	}
	public void setISBN(Book iSBN) {
		ISBN = iSBN;
	}
	public Transaction(int transId, int quantity, Patron pId, LocalDate date, double totalPrice, Book iSBN) {
		super();
		this.transId = transId;
		this.quantity = quantity;
		this.pId = pId;
		this.date = date;
		this.totalPrice = totalPrice;
		ISBN = iSBN;
	}
	public int getTransId() {
		return transId;
	}
	public void setTransId(int transId) {
		this.transId = transId;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Patron getpId() {
		return pId;
	}
	public void setpId(Patron pId) {
		this.pId = pId;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
//	CRUD operations: Issue Book, Return Book, Display Transactions.
	
	
}
