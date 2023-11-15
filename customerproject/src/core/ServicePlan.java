package core;

public enum ServicePlan {
	SILVER(100),
	GOLD(500),
	DIAMOND(1000),
	PLATINUM(5000);
	private double amount;
	ServicePlan(double amount){
		this.amount=amount;
	}
	public double getAmount() {
		return amount;
	}

}
