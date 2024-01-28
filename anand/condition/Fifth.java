package com.anand.condition;

public class Fifth {

	public static void main(String[] args) {
		String a= "abcdef";
		String b= "xyz1234";
		String c= "abcxy";
		
		String str = b.toUpperCase();
		System.out.println(str.contains("Z") && !str.contains("z"));
	}
}