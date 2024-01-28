package com.anand.defaultPackage;
import java.util.Scanner;

public class IncrementProgram {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int a = ob.nextInt();

        
       // System.out.println("Original number: " + a);
        
        // Increment the number
        a++;
        System.out.println("After increment: " + a);
        
        // Increment the number again
        System.out.print("Enter a Number:");
        int b=ob.nextInt();

        System.out.println("B:"+ b);
        b++;
        System.out.println("After second increment: " + b);
        
    
    }
}
