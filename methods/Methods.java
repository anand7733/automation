//Static and Non Static Methods in same class

package methods;

public class Methods {
	//Creating static method
	public static void a1()//using public access specifier
	{
		int a=20;
		int b=30;
		System.out.println(a*b);
	}
	private static void a2()//private access specifier
	{
		int a=10;
		int b=30;
		System.out.println(a*b);
	}
	protected static void a3()//protected access specifier
	{
		int a=10;
		int b=10;
		System.out.println(a*b);
	}
	 static void a4()//default access specifier
	{
		int a=10;
		int b=50;
		System.out.println(a*b);
	}
	public void b1()
	{
		int a=40;int b=50;
		System.out.println(a+b);
	}
	private void b2()
	{
		int a=40;int b=50;
		System.out.println(a+b);
	}
	protected void b3()
	{
		int a=40;int b=50;
		System.out.println(a+b);
	}
	 void b4()
	{
		int a=40;int b=50;
		System.out.println(a+b);
	}
	public static void main(String[]args)
	{
		//Calling Static method
		a1();//calling direct static methods
		a2();//calling via class use static methods
		a3();
		a4();
		//Non static Method
		Methods ob=new Methods();// calling object non-static methods 
		ob.b1();// object call methods
		ob.b2();
		ob.b3();
		ob.b4();
	}
}
