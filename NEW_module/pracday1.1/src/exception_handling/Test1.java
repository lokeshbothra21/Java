package exception_handling;

public class Test1 {

	public static void main(String[] args) {
	try {
		String [] names = {"one","two","three"};
	System.out.println(names[0]);
	System.out.println(names[3]);
	int a=10;
	int b=0;
	System.out.println("Parse_int:"+Integer.parseInt("12345"));
	System.out.println("After parsing");
	System.out.println("Div:"+a/b);
	System.out.println("After division");
	
	}
	
//	catch(ArrayIndexOutOfBoundsException e) {
//		System.out.println(1);
//	}
//	catch(ArithmeticException e) {
//		System.out.println(2);
//	}
	catch(Exception e) {
		
		System.out.println("Starting catch block");
		System.out.println(e.getMessage());
		System.out.println(e);
		e.printStackTrace();
	}
	
	
	System.out.println("Main cont.");
	}

}
