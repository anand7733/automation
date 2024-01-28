//Method overriding Polymorphism

package com.anand.polymorphism;

 class A 
{
		public void A1()
		{
			System.out.println("This is A1 method in a class");
		}
}
 class B extends A
 {
	 public void A1()
	 {
		 System.out.println("This is A1 method in B class");
	 }
 }
 
 class C extends B
 {
	 public void A1()
	 {
		 System.out.println("This is A1 method is class");
	 }
 }
 
  public class E extends C
 {
	 public static void main(String[]args)
	 {
		 E ob=new E();
		 ob.A1();
	 }
 }
 