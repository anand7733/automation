package com.anand.defaultPackage;
import java.util.Scanner;
class UserinputDemo1{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        System.out.print("enter a string");
        String str=ob.nextLine();
        System.out.print("You have enter:"+str);
    }
}