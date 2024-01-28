package com.anand.constructor;

public class Button {

		int a;int b;String c;
		Button(int height,int width,String bName)
		{
			a= height;
			b=width;
			c=bName;
		}
		
		void buttonCreate()
		{
			System.out.println("Button create height,width");
		}
		void buttonClickable()
		{
			System.out.println("Cutton is clickable");
		}
		
		public static void main(String[]args)
		{
			Button Ob =new Button(20,30,"OK");
			Ob.buttonCreate();
			Ob.buttonClickable();
			
			Button cancel=new Button(30,50,"Cancel");
			cancel.buttonCreate();
			cancel.buttonClickable();
		}
}
