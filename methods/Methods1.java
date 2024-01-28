//Static and non-static methods call different Class

package methods;

public class Methods1 {

	public static void main(String[]args) {
		Methods.a1();
		//Methods.a2();// this methods private access specifier
		Methods.a3();
		Methods.a4();
		Methods ob=new Methods();// calling object non-static methods 
		ob.b1();// object call methods
		//ob.b2();//private access specifier
		ob.b3();
		ob.b4();
	}
	
}
