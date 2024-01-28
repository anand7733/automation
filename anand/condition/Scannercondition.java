package com.anand.condition;
import java.util.Scanner;

public class Scannercondition {

	public static void main(String[] args) {
			Scanner ob= new Scanner(System.in);
			int age=ob.nextInt();
			if(age>18)
			{
				System.out.println("Adult");
			}
			else {
				System.out.println("Not adult");
			}

	}

}
