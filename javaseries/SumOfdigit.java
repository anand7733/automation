package javaseries;
import java.util.Scanner;
public class SumOfdigit {

	public static void main(String[] args) 
	{
		
		Scanner ob=new Scanner(System.in);
		int num =ob.nextInt();
		int sum=0;
		int rem;
		while (num>0)
		{
			rem=num%10;
			sum=sum+rem;
			num=num/10;
			
		}
		System.out.println("Sum of Digit");
	}

}
