// Methods arguments for Static method and Non static
package methodsone;

public class MethodsArg {
		public static void add(int a,int b)
		{	int c=20; int d=10;
			System.out.println(a+b);
			System.out.println(c*d);
		}
		private static void sub(int e,int f)
		{
			System.out.println(e-f);
		}
		protected void multiply(int g,int l)
		{
			System.out.println(g*l);
		}
		public static void main(String[]args)
		{
			add(20,30);
			sub(40,20);
			
			MethodsArg ob=new MethodsArg();
			ob.multiply(10, 10);
		}
}
