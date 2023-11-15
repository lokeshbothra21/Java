package com.health.core;

public enum room {
	GENERAL(2000), SPECIAL(5000), SEMISPECIAL(3000),ICU(7000);
	private double price;
	room(double price){
		this.price=price;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	

}
