package com.anand.defaultPackage;
import java.util.Scanner;
class Scannermultiply
{
    public static void main(String[]args)
    {
        Scanner ob =new Scanner(System.in);
        System.out.print("Enter no.");
        int a = ob.nextInt();
        System.out.print("Enter no.");
        int b=ob.nextInt();
        int c = a*b;
        System.out.print("Total="+c);
    }
}