package com.code;
import java.text.SimpleDateFormat;
import java.util.*;
import com.code.*;

public class Vehicle {

	private String chasisno;
	private double baseprice;
	private color vehiclecolour;
	private Date manufacturedate;
	private String company;
	private boolean isavailable;
	public static SimpleDateFormat sdf;
	static {
		sdf=new SimpleDateFormat("dd/mm/yyyy");
	}
	
		public Vehicle(String chasisno, double baseprice, color vehiclecolour, Date manufacturedate, String company) {
		super();
		this.chasisno = chasisno;
		this.baseprice = baseprice;
		this.vehiclecolour = vehiclecolour;
		this.manufacturedate = manufacturedate;
		this.company = company;
		this.isavailable=true;
	}

@Override
		public String toString(){
			return "details:"+chasisno+baseprice+vehiclecolour+manufacturedate+company;
		}
	
		@Override
		public boolean equals(Object o) {
			System.out.println("in vehicle eq");
			if(o instanceof Vehicle) {
				
				Vehicle v=(Vehicle)o;
			return this.chasisno.equals(v.chasisno);
		}
			return false;
		}

}
