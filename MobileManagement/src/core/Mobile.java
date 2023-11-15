package core;

import java.time.LocalDate;

public class Mobile {
	private String name,company;
	private double price;
	private int mobileid;
	boolean isavailable;
	LocalDate modelyear;
	Model mdl;
	
	public Mobile(String name, String company, double price, int mobileid, LocalDate modelyear,
			Model mdl) {
		super();
		this.name = name;
		this.company = company;
		this.price = price;
		this.mobileid = mobileid;
		this.isavailable = true;
		this.modelyear = modelyear;
		this.mdl = mdl;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getMobileid() {
		return mobileid;
	}

	public void setMobileid(int mobileid) {
		this.mobileid = mobileid;
	}

	public boolean isIsavailable() {
		return isavailable;
	}

	public void setIsavailable(boolean isavailable) {
		this.isavailable = isavailable;
	}

	public LocalDate getModelyear() {
		return modelyear;
	}

	public void setModelyear(LocalDate modelyear) {
		this.modelyear = modelyear;
	}

	public Model getMdl() {
		return mdl;
	}

	public void setMdl(Model mdl) {
		this.mdl = mdl;
	}

	@Override
	public String toString() {
		return "Mobile [name=" + name + ", company=" + company + ", price=" + price + ", mobileid=" + mobileid
				+ ", isavailable=" + isavailable + ", modelyear=" + modelyear + ", mdl=" + mdl + "]";
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Mobile) 
			return this.mobileid==((Mobile)obj).mobileid;
			return false;
		
	}
	
	
	

}
