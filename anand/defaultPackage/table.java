package com.anand.defaultPackage;
public class table{

     public static void main(String []args){
         int a=1;
        for(int i=1; i<=10;i++)
        {
            a++;
            for(int j=1; j<=10; j++)
            {
                System.out.print(a*j +" ");
            }
            System.out.println();
        }
     }
}