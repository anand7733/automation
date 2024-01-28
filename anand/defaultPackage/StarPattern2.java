package com.anand.defaultPackage;
public class StarPattern2 
{
            public static void main (String[]args)
        {   
            for(int i=1;i<=5;i++)
            {
                for(int j=4;j>=i;j--)
                {
                    System.out.print(" ");
                }
                for(int k=1;k<=i;k++)
                {
                    System.out.print("*");
                }
                System.out.println();
            
            }
        }
 }
 /*Output                                    i    rows                           j columns   k
     ****            *                       4blank space after k print          4           1
     ***            **                       3                                   3           2
     **            ***                       2                                   2           3
     *            ****                       1                                   1           4   
                 *****                                                                       5
  
*/

  /*
   i=1      1<=5    j=4     j>=i   space print  j--    k=1     k<=i   *      k++       i++
   1        1<=5    4       4>=1    space       3                                       1
   1                3       3>=1    space       2                                       1
   1                2       2>=1    space       1                                       1   
   1                1       1>=1    space       0                                       1
   1                0       0>=1    loop exit second loop start
   1                                                    1       1<=1   *      2         1
   1                                                    2       2<=1   loop exit
   2        2<=5    4       4>=2    space       3                                       2
   2                3       3>=2    space       2                                       2
   2                2       2>=2    space       1                                       2
   2                1       1>=2    loop exit second loop start
   2                                                    1        1<=2    *     2        2
   2                                                    2        2<=2   *      3        2
   2                                                    3       3<=2     loop exit       2
   
   */