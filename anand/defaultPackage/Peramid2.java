package com.anand.defaultPackage;
import java.util.Scanner;
public class Peramid2{
    public static void main(String[]args)
    {
        Scanner ob=new Scanner(System.in);
        int n= ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=4;j>=1;j--)
            {
                if(j>i)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print(" *");
                }
            }
            System.out.println();
        }
    }
}