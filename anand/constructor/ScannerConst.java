//Constructor with scanner

package com.anand.constructor;
import java.util.Scanner;

public class ScannerConst {
	
	//creating variables
	
	int a;int b;int c;
	//Creating constructor
	ScannerConst(int m1,int m2)
	{
		a=m1;
		b=m2;
	}
	ScannerConst(int m1,int m2,int m3)
	{
		a=m1;
		b=m2;
		c=m3;
	}
	
	//creating method
	
	void total()
	{
		System.out.println(a+b);
	}
	void percentage()
	{
		System.out.println(a+b/2);
	}
	
	void toatal1()
	{
		System.out.println(a+b+c);
	}
	
	void percentage1()
	{
		System.out.println(a+b+c/3);
	}
	
	
	public static void main(String[]args)
	{
		Scanner ob=new Scanner (System.in);
		System.out.println("Enter a value x:");
		int x =ob.nextInt();
		System.out.println("Enter a value b:");
		int y=ob.nextInt();
		System.out.println("Enter a value z:");
		int z=ob.nextInt();
		
		ScannerConst ob1=new ScannerConst(x,y);
		ob1.total();
		ob1.percentage();
		
		ScannerConst ob2=new ScannerConst(x,y,z);
		ob2.toatal1();
		ob2.percentage1();
	}
}



