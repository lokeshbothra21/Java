package tester;

import com.banking.JointAccount;

import runnable_tasks.BalUpdaterTask;
import runnable_tasks.CheckBalTask;

public class TestSharedResource {

	public static void main(String[] args) throws InterruptedException{
		// create a singleton instance of joint acct
		JointAccount acct=new JointAccount(10000);
		//create tasks , attach thme to thrds n start the thrds
		Thread t1=new Thread(new BalUpdaterTask(acct),"c1");
		Thread t2=new Thread(new CheckBalTask(acct), "c2");
		t1.start();
		t2.start();
		System.out.println("waiting for child thrds to complete exec");
		t1.join();
		t2.join();
		System.out.println("main over....");

	}

}
