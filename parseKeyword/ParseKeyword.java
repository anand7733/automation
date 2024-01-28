// Convert datatype use parse keyword
package parseKeyword;

public class ParseKeyword {
	public static void main(String []args)
	{
		String s="127";
		
		int i=Integer.parseInt(s);
		System.out.println(i);
		double d=Double.parseDouble(s);
		System.out.println(d);
		float f=Float.parseFloat(s);
		System.out.println(f);
		byte b=Byte.parseByte(s);
		System.out.println(b);
		
		
	}
}
