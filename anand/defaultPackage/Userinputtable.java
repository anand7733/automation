package com.anand.defaultPackage;
import java.util.Scanner;
public class Userinputtable {
   public static void main(String[] args)

{
   int j,n;

   System.out.print("Input the number(Table to be calculated): ");
{
   System.out.print("Input number of terms : ");
    Scanner in = new Scanner(System.in);
		    n = in.nextInt();

   System.out.println ("\n");
   for(j=1;j<=n;j++)
  
     System.out.println(n+" X "+j+" = " +n*j);
   }
}
}
