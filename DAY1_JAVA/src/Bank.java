
public class Bank {
	private int accno;
	private String customername;
	private double balance;
	
	public Bank(int accno,String customername,double balance) {
		this.accno=accno;
		this.customername=customername;
		this.balance=balance;
	}
	
	public void withdraw(double amt) {
		this.balance=this.balance-amt;
	}
	public void deposit(double amt) {
		this.balance=this.balance+amt;
	}
	
	public void display() {
		System.out.println("Account no:"+accno);
		System.out.println("Customername:"+customername);
		System.out.println("balance:"+balance);
	}

}
