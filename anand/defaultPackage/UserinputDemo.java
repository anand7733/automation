package com.anand.defaultPackage;
import java.util.Scanner;
class UserinputDemo
{
    public static void main(String[]args)
        {
            Scanner ob = new Scanner(System.in);
            System.out.print("Enter First no.-");
            int a=ob.nextInt();
            System.out.print("Enter Second no.-");
            int b=ob.nextInt();
            System.out.print("Enter third no.-");
            int c=ob.nextInt();
            int d=a+b+c;
            System.out.println("Total="+d);
        }

}