import java.util.*;
public class Gcd {

	public static void main(String[] args) {
		int n1,n2,i,gcd=0;
		System.out.println("Enter the fisrt number:");
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		System.out.println("Enter the second number:");
		n2=sc.nextInt();
		
		for(i=1;i<=n1 &&i<=n2;i++) {
			if(n1%i==0&&n2%i==0)
				gcd=i;
			
		}
	System.out.println("gcd:"+gcd);
	}
	

}
