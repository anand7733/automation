package nonstaticvariable;

public class NonStaticVar {

	public int a=40;// public access specifier allows all variable ,methods, any where call 
	private int b=50;//private access specifier allows only same class
	protected int c=20;//protected access specifier allows same class and different class
	int d=40;//default access specifier allows same class different class

	public static void main(String[] args) {
		NonStaticVar ob=new NonStaticVar();//first call Class name and object name new keyword class name.
		System.out.println(ob.a* ob.b);//object call non static /instant variable
		System.out.println(ob.c*ob.d);
		System.out.println(ob.a*ob.b*ob.c*ob.d);

	}
}
