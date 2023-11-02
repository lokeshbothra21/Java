package lambda_expressions;

import java.util.Arrays;

public class Test7 {

	public static void main(String[] args) {
	int [] ints= {10,20,23,561,456,70,78,90};
	Arrays.stream(ints)
	.filter(i->i>50)
	.filter(i->i*i)
	.forEach(i -> System.out.print(i + " "));
	System.out.println("\n-----------------");

	}

}
