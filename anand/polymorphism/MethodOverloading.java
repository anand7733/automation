//Method overloading Polymorphism 
package com.anand.polymorphism;

public class MethodOverloading {
	
	public void openSheet(String sname)
	
	{
		System.out.println("Sheet opened with name");
	}
	public void openSheet(int sname)
	{
		System.out.println("Sheet opened with no.");
	}
	public static void main(String[]args)
	{
		MethodOverloading ob=new MethodOverloading();
		ob.openSheet(55);
		ob.openSheet("abcd");
	}
	
}
