package com.anand.defaultPackage;
public class Startpattern3 
{
     public static void main(String[]args)
     {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(int k=5;k>=i;k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
     }
}
/* Output

    i=1      i<=5    j=1     j<=i   space print  j++    k=5     k>=i   *      k--       i++
    1        1<=5    1       1<=1   Space print  2
    1        1<=5    2       2<=1   exit loop second loop
 
 */