package com.anand.defaultPackage;
import java.util.Scanner;
public class Userinputstar {
   public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = in.nextInt();

        for (int i = 0; i < n; i++) 
        {
            for (int j = n - i; j > 0; j--) 
            {
                System.out.print(" ");
            }
            for (int k = 0; k >= i; k--) 
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }

}
