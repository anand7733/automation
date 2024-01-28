package com.anand.condition;

public class Stringmethod {

	public static void main(String[] args) {
		
		String a= "abcdef";
		String b="xyz1234";
		String c="abcxy";//space also count as char
		
		//Length method
		//System.out.println(a.length());
		//System.out.println(b.length());
		//System.out.println(c.length());
		
		//this method start method && end method
		//System.out.println(a.startsWith("B"));
		//System.out.println(b.endsWith("h"));
		//System.out.println(a.endsWith("B"));
		//System.out.println(b.endsWith("d"));
		
		//Uppercase && lowercase
		
		//System.out.println(a.toLowerCase());
		//System.out.println(b.toUpperCase());
		
		//System.out.println(a.equals(b));
		//System.out.println(a.equals(c));
		//System.out.println(c.equalsIgnoreCase(a));
		
	//	System.out.println(a.contains("cd"));
	//	System.out.println(a.contains("xy"));
		if(a.length()>c.length() && a.length()<b.length()) {
			 System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
		
		
		
		//if(a,equals(b)== false&& a.equals(c)==false) {
		//System.out.println("pass");
		//}
		//else {
		//	System.out.println("Fail");
		//}
		
		
		
		b=b.toUpperCase();
		System.out.println(b);
		System.out.println(b.contains("Z"));
		System.out.println(b.contains("z"));
	}

}
