package com.library.core;

import com.library.enums.Genre;

public class Book implements Comparable{

//	Attributes: ISBN (String), Title (String), Author (String), Genre (Enum: Fiction, Non-Fiction, Mystery, etc.), 
//	Quantity (int), Price (double).
//	CRUD operations: Add, Update, Delete, Display.
	private String ISBN,Title,Author;
	private int Quantity;
	private double price;
	Genre gn;
	public Book(String iSBN, String title, String author, int quantity, double price, Genre gn)  {
		super();
		ISBN = iSBN;
		Title = title;
		Author = author;
		Quantity = quantity;
		this.price = price;
		this.gn = gn;
	}
	@Override
	public String toString() {
		return "Library [ISBN=" + ISBN + ", Title=" + Title + ", Author=" + Author + ", Quantity=" + Quantity
				+ ", price=" + price + ", gn=" + gn + "]";
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Genre getGn() {
		return gn;
	}
	public void setGn(Genre gn) {
		this.gn = gn;
	}
	@Override
	public int hashCode() {
		return ISBN.hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book)
			return this.ISBN.equals(((Book)obj).ISBN);
		return false;
	}
	@Override
	public int compareTo(Object o) {
		
		return this.ISBN.compareTo(((Book)o).ISBN);
	} 
	
	
}
