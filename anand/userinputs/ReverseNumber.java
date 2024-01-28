//Write a Reverse integer no. user scanner input
package com.anand.userinputs;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args)
	{
		Scanner obj = new Scanner (System.in);// object declare by scanner class
		System.out.println("Enter the no.");
		int num=obj.nextInt();
		int rev=0;
		int rem;
		while(num>0)
		{
			rem=num%10;	//print first 123%10 rem=3   second 12%10   rem=2  third 1%10 rem=1
			rev=rev*10+rem;//print first 0*10+3=3    second 0*10+2=2    third 0*10+1=1
			num=num/10;//print 123/10=12  second 12/10=1
		}
		System.out.println("Resverse No.is "+rev);//first print 3 second 2 third 1
		
	}

}
