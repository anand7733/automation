package com.anand.defaultPackage;
public class Devisblebyseven {
    public static void main(String[]args)
    {
        int num=100;
        for(int i=1;i<=num;i++)
        {
            if(i%7==0)
            {
                System.out.println(i);
            }
        }
    }
}

/*num=100
//int i=1   i<=num  if(i%7==0)  print(i)    i++
i=1       1<=100  1%7==0      no          2
i=2       2<=100  2%7==0      no          3
i=3       3<=100  3%7==0      no          4
i=4       4<=100  4%7==0      no          5
i=5       5<=100  5%7==0      no          6
i=6       6<=100  6%7==0      no          7
i=7       7<=100  7%7==0      7           8
i=8       8<=100  8%7==0      no          9*/
/* OUTPUT
7
14
21
28
35
42
49
56
63
70
77
84
91
98 */