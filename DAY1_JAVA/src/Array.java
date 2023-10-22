import java.util.Scanner;
public class Array {
	
	
	
	
	public static void main(String[] args) {
		int[] arr= {10,20,30,40,50,60,70,90};
		int ch;
		do {
		System.out.println("1.Show array 2.Add element 3.Search element "
				+ "4.Double Array elemtn 5.sort array 6.Exit");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			for(int i:arr) {
				System.out.println(i+" ");
			}
		case 2:
			System.out.println("Enter the elements:");
			
		
		}
		}while(ch!=6);
		
		
	}
}
