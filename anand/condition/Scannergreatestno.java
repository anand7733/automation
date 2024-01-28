
//Write a Java program that takes three numbers from the user and prints the greatest number.

package com.anand.condition;
import java.util.Scanner;

public class Scannergreatestno {

	public static void main(String[] args) {
		
		Scanner ob=new Scanner(System.in);
		System.out.println("A No.");
		int a =ob.nextInt();
		
		System.out.println("B No.");
		int b=ob.nextInt();
		
		System.out.println("C No.");
		int c=ob.nextInt();
		
		if(a>b  && a>c)
		{
			System.out.println("A is Greator");
		}
		if(b>a || b>c)
		{
			System.out.println("B is Greator");
		}
		
		if(c>a && c>b)
		{
			System.out.println("C is Greator");
		}
	} 

}
