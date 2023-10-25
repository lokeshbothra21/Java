package exception_handling;
import custom_Exception.DrivingLicenseExpired;
import java.util.Scanner;
import static utils.Validationdl.expiryDate;
public class TestCustomeExceptionDl {

	public static void main(String[] args) {
		System.out.println("In TestCustomException");
		try {
			System.out.println("Enter year:");
			Scanner sc =new Scanner(System.in);
			expiryDate(sc.nextInt());	
		}
		catch(Exception e){
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally code executed");
		}

	}

	

}
