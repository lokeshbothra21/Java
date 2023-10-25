package exception_handling;

public class Test2 {

	public static void main(String[] args) {
		System.out.println("before");
		try {
				Thread.sleep(5000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("after");
	}

}
