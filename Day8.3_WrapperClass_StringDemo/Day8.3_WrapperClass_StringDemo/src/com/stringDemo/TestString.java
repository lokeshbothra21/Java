package com.stringDemo;

public class TestString {

	public static void main(String[] args) {
	    //Date d1=new Date(1,1,2011);
		//Date  d2=new Date(1,1,2011);
		//if(d1==d2){}//false part 
		//we override equalsMethod
		//d1.equals(d2);//data member value
		String str1="abc";
		String str2="abc";
		System.out.println("Str1:"+str1.hashCode()+"   str2="+str2.hashCode());
		if(str1==str2)
		{
			System.out.println("str1==str2");
		}
		else
		{
			System.out.println("str1!=str2");
		}
		str2="xyz";
		System.out.println("Str1:"+str1.hashCode()+"   str2="+str2.hashCode());
		
		String str3="abc";
		System.out.println("Str1:"+str1.hashCode()+"   str2="+str2.hashCode()+"   str3="+str3.hashCode());
		
		//equals method is override by String class and work on content
		if(str1.equals("abc")) {
			System.out.println("str1=abc");
			
		}
		//
		
		String  str4=new String("abc");
		
		if(str1.equals(str4))
		{
			System.out.println("str1==str4");
		}
		else
		{
			System.out.println("str1!=str4");
		}
		
		System.out.println("----String Class-------------");
		String str="This is example of String";
		System.out.println("LowerCase :"+str.toLowerCase());
		System.out.println("UpperCase :"+str.toUpperCase());
		System.out.println("Lenght :"+str.length());
		System.out.println("Contains :"+str.contains("i"));
		System.out.println("char at :"+str.charAt(5));
		System.out.println("LowerCase :"+str.substring(1, 7));
		
		
		//mutable string:StringBuffer And StringBuilder
		
		
		StringBuffer buffer1=new StringBuffer("iacsd");
		System.out.println(buffer1+"     "+buffer1.hashCode());
		
		StringBuffer buffer2=new StringBuffer("iacsd");
		System.out.println(buffer2+"     "+buffer2.hashCode());
		
		buffer1=buffer1.append(" Pune");
		System.out.println("\n");
		System.out.println(buffer1+"     "+buffer1.hashCode());
		
		StringBuilder builder1=new StringBuilder("xyz");
		StringBuilder builder2=new StringBuilder("xyz");
		System.out.println(builder1+"     "+builder1.hashCode());
		
		System.out.println(builder2+"     "+builder2.hashCode());
		
		
		
		
		
		
	}

}
