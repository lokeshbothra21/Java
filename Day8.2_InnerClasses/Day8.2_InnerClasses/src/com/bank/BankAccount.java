package com.bank;

public class BankAccount {

	private int accountid;
	private String custName;
	private double balance;
	//
	private Locker lockerObj;
	// assign locker
	public void assignLocker(int lockerid,int duration) {
		this.lockerObj=new Locker(lockerid, duration);
		
	}
	
	public BankAccount() {
		this.accountid=101;
		this.custName="Ram";
		this.balance=1000;
	}

	public BankAccount(int accountid, String custName, double balance) {
		super();
		this.accountid = accountid;
		this.custName = custName;
		this.balance = balance;
	}

	@Override
	public String toString() {
		if(this.lockerObj==null)
		return "BankAccount " + accountid + "" + custName + "   " + balance +" No Locker assigned yet" ;
		else
			return "BankAccount " + accountid + "" + custName + "   " + balance+" "+lockerObj;	
	}
	
	//create member inner class Locker inside BankAccount class
	
	private class Locker{
		//data member
		private int lockerId;//auto increment
		private int duration;
		private double charges;
		
		//constr
		public Locker(int lockerId,int duration) {
			System.out.println("Locker Constr get invoked");
			System.out.println("Locker get assigned to AccountNO:"+accountid);
			this.lockerId=lockerId;
			this.duration=duration;
			this.charges=500 *duration;
		}
		
		public String toString() {
			System.out.println("Locker For Customer "+custName +"  Account Id="+accountid);
			return "Locker Details: "+lockerId+"  Duration:"+duration+"    Charges:"+charges;
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
