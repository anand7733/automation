//Write a java program to get a number from user and print whether it is positive and negative

package com.anand.condition;
import java.util.Scanner;

public class ScannerPositiveNegative
{

	public static void main(String[] args) 
	{
		Scanner ob = new Scanner(System.in);
		System.out.print("Input no.");
		int a = ob.nextInt();
		if(a>0)
		{
			System.out.println("Number is positive");
		}
		else if (a<0)
		{
			System.out.println("Number is negative");
		}
		else
		{
			System.out.println("Number is zero");
		}	
	}			
}


