package com.code;

public class OuterClass {
      private int id;
      private String name;
      private InnerClass innerObj;
      //getter
      public  InnerClass getInnerObj() {
    	  return this.innerObj;
      }
      //setter
      public void setInnerClass() {
    	  this.innerObj=new InnerClass();
      }
      
      //static inner class
      public static class  StaticClass
      {
    	  
      }
      
      //constr,getter setters toString()      
      //member of Outer Class
      private class InnerClass
      {
    	  private int no1;
    	  public InnerClass() {
    		  System.out.println("Inner Class  Default");
    		  no1=100;
    	  }
    	  public String toString() {
    		  System.out.println("Outer Class Id="+id);
    		  return "Inner Class:"+no1;
    	  }
    	       }
 public void display( ) {
    	  
    	  int abc=120;
    	  class  MethodInnerClass  {
    		  int no2=100;
    		  public MethodInnerClass() {
    			System.out.println("Method Inner class Default constr");  
    			  }
    		  public String toString() {
    			  return "ToString Of MethodInnerClass :"+no2;
    		  }
    		 }
    	  
    	  System.out.println("---Method Local Inner class Object must be created in side method only in which it is declared");
    	  MethodInnerClass innerObj=new MethodInnerClass();
    	  System.out.println(innerObj);
    	  }
      public String toString()
      {
    	  return "Outer Class Id="+id;
      }
}
