package com.anand.defaultPackage;
public class fivestar {
    public static void main (String[]args)
    {
        for(int i=1;i<=5;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
/*
 int i=i    i<=5    j=1     j<=i    print       j++              i++
    i=1     1<=5    1       1<=1    *           2
    i=1     1<=5    2       2<=1    false      j loop exit      2
    i=2     2<=5    1       1<=2    *           2               
    i=2      2<=5   2       2<=2    **          3       
    i=2     2<=5    3       3<=2    false       j loop exit     3
    i=3     3<=5    1       1<=3    *           2       
    i=3     3<=5     2      2<=3    **          3       
    i=3     3<=5    3       3<=3    ***         4   
    i=3     3<=5    4       4<=3    false       j loop exit

 */