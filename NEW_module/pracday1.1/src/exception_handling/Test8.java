package exception_handling;

import java.util.Scanner;
public class Test8 {

	public static void main(String[] args) {
		try(Scanner sc =new Scanner(System.in)) {
			System.out.println("Enter int value:");
			System.out.println("pasrseint:"+Integer.parseInt(sc.next()));
			System.out.println("End of try");
			}
		System.out.println("main contd");

	}

}
