package utils;
import custom_Exception.DrivingLicenseExpired;
public class Validationdl {
	
		public static final int curyear;
		public int dlyear;
		
		static {
			curyear=2023;
			}
		
		public static void expiryDate(int dlyear) throws DrivingLicenseExpired {
				if((curyear-dlyear)>=10)
					throw new DrivingLicenseExpired("Your license has expired");
				System.out.println("You can continue");
				System.out.println();
			
		}
}
