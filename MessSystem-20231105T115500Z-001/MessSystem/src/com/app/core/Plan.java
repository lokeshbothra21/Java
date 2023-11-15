package com.app.core;

public enum Plan {
	MONTHLY(3000), QUARTERLY(11700), HALFYEAR(17500), YEARLY(32000);
	private double pamount;
	private Plan(double pamount) {
		this.pamount=pamount;
	}
	public double getPamount() {
		return pamount;
	}
	public void setPamount(double pamount) {
		this.pamount = pamount;
	}
	
}
