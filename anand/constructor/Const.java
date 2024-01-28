//This default constructor 

package com.anand.constructor;

public class Const {
	
		Const(){
			System.out.println("This a constructor");
			
		}
		
		//Creating Method
		public void method()
		{
			System.out.println("This is Method");
		}

	
		public static void main(String[]args)
		{
			Const ob=new Const();
			ob.method();
		}
}