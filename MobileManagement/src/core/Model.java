package core;

public enum Model {
	MSERIES(10000),SSERIES(15000),XSERIES(20000);
	double price;
	
	private Model(double price) {
		this.price=price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
