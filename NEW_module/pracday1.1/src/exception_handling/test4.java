package exception_handling;

public class test4 {

	public static void main(String[] args) {
		try {
			testme("a12345");
			}
			catch(Exception e){
			System.out.println("In main's try block");
			}
			finally {
			System.out.println("in main's finally");
			}
		System.out.println("main over....");
		}	
		static void testme(String s) {
			System.out.println("In test me");	
			try {
					System.out.println("parseint:"+Integer.parseInt(s));
				}
				finally {
					System.out.println("In finally method");
				}
			System.out.println("End of method");
		
	}

}
