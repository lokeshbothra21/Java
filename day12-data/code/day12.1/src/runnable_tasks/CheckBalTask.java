package runnable_tasks;

import java.util.Random;

import com.banking.JointAccount;

public class CheckBalTask implements Runnable{
	//state
	private JointAccount jointAccount;	
	private Random r1;

	public CheckBalTask(JointAccount jointAccount) {
		super();
		this.jointAccount = jointAccount;
		r1=new Random();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName()+" strted");
		try {
			//B.L
			while(true)
			{
				double bal=jointAccount.checkBalance();
				if(bal != 10000)
				{
					System.out.println("ERROR!!!!!!!!!!!!!!!!!!!!!!");
					System.exit(-1);
				}
				Thread.sleep(r1.nextInt(701)+300);//sleep 300--1000
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got err "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
		
	}

}
