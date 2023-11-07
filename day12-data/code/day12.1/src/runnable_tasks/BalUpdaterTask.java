package runnable_tasks;

import java.util.Random;

import com.banking.JointAccount;

public class BalUpdaterTask implements Runnable{
	//state
	private JointAccount jointAccount;	
	private Random r1;

	public BalUpdaterTask(JointAccount jointAccount) {
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
				jointAccount.updateBalance(4500);
				Thread.sleep(r1.nextInt(401)+100);//sleep 100-500
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName()+" got err "+e);
		}
		System.out.println(Thread.currentThread().getName()+" over");
		
	}

}
