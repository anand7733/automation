//Constructor overloading

package com.anand.constructor;

public class ConstOverloading {
					//creating variables
				int a;int b;int c;
				
				//Creating constructor
				ConstOverloading(int m1,int m2)
				{
					a=m1;
					b=m2;
				}
				ConstOverloading(int m1,int m2,int m3)
				{
					a=m1;
					b=m2;
					c=m3;
				}
				
				//creating method
				
				void total()
				{
					System.out.println(a+b);
				}
				void percentage()
				{
					System.out.println(a+b/2);
				}
				
				void toatal1()
				{
					System.out.println(a+b+c);
				}
				
				void percentage1()
				{
					System.out.println(a+b+c/3);
				}
				
				
				public static void main(String[]args)
				{
					ConstOverloading ob=new ConstOverloading(60,70);
					ob.total();
					ob.percentage();
					
					ConstOverloading ob1=new ConstOverloading(90,80,70);
					ob1.toatal1();
					ob1.percentage1();
				}
}
