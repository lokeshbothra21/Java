package com.tester;
import java.util.*;
import com.code.Array;

public class ArrayTest {

	public static void main(String[] args) {
		
		int ch,i=0;
		int index=0;
		System.out.println("--------Menu-------");
//		Scanner sc=new Scanner(System.in);
//		Array [] arr=new Array[5];
//		Array e= new Array(sc.nextInt(),sc.next());
//		arr[0]=e;
//		System.out.println(arr[0]);
		Array[] arr=new Array[5];
		do {
			
		System.out.println("1.Add element 2.show element 3.Exit");
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		
		switch(ch) {	
		case 1:
//			int num=0;
//			System.out.println("Enter the no of elements you want to add:");
//			num=sc.nextInt();
			
			System.out.println("Add elements:");
			Array e =new Array(sc.nextInt(),sc.next());
			arr[index]=e;
			index++;
			break;
		case 2:
			System.out.println("Showing elements");
			for(Array j:arr) {
				System.out.println(j);
			}
			break;
			
		
		}
		}while(ch!=3);

	}

}
