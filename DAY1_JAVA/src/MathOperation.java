
public class MathOperation {
	private int total=0;
	public int add(int a,int b) {
		
		return a+b;
	}
	
	public int add(int a,int b,int c) {
		return a+b+c;
	}
	
	public int add(int... a) {
		for(int sum:a)
			total=total+sum;
		return total;
	}
	public static void main(String[] args) {
		MathOperation obj=new MathOperation();
		System.out.println(obj.add(10, 10));
		System.out.println(obj.add(10, 10,10));
		System.out.println(obj.add(10, 10,10,10,10,10));
		

	}

}
