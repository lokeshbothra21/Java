//1:Write a program that accepts numbers continuously as long as the number is positive 
//and prints the sum of the given numbers. 
import java.util.*;
public class SumOfNum {

	public static void main(String[] args) {
		int num;
		int res=0;
	
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("Enter the number:");
			num =sc.nextInt();
			res=res+num;
		}while(num>0);
		System.out.println("The sum is:"+res);

	}

}
