package com.anand.defaultPackage;
public class Incrementvalue2 {
    public static void main(String[]args){
        int num=10;
        for(int i=1;i<=num;i+=2){
            System.out.println(i+" ");
        }
    }
}
//i=1       i<=num  print(i)    i+=2
//i=1       1<=10  1           1+2=3
//i=3       3<=10  3           3+2=5
//i=5       5<=10  5           5+2=7
//i=7       7<=10  7           7+2=9
//i=9       9<=10  9           9+2=11
//i=11      11<=10 errror      end loop