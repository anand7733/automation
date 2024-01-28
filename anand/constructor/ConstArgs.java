//Constructor with argument

package com.anand.constructor;

public class ConstArgs {
	//creating variables
	int a;
	int b;
	
	//creating constructor
	ConstArgs (int m1, int m2)
	{
		a=m1;b=m2;
	}
	
		//Creating Method
		void total()
		{
			System.out.println(a+b);
		}
		void percentage()
		{
			System.out.println(a+b/2);
			//return null;
		}
		
		public static void main(String[]args)
		{
			ConstArgs ob=new ConstArgs(60,70);
			ob.total();
			ob.percentage();
		}
}
