package com.tester;
import com.code.Vehicle;
//for static members
import static com.code.Vehicle.display;
import static java.lang.System.out;
public class tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//to call stattic
		Vehicle.display();
		
		//after static import 
		display();
		
		
		out.print("-----");
		
		
	}

}
