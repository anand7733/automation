
package methodsone;
import methods.Methods;
public class Methods2 {
	public static void main(String[]args)
	{
		//Static method call different package
		Methods.a1();
		//Methods.a2();//private access specifier cannot call different package
		//Methods.a3();//private access specifier cannot call different package
		//Methods.a4();//Default  access specifier cannot call different package
		
		// Non-Static Methods call different package
		Methods ob=new Methods();
		ob.b1();
		//ob.b2();//private access specifier cannot call different package
		//ob.b3();//private access specifier cannot call different package
		//ob.b4();//Default  access specifier cannot call different package
		
	}

}
