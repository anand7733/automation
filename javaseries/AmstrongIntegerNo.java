package javaseries;
import java.util.Scanner;

public class AmstrongIntegerNo {

	public static void main(String[] args) {
		Scanner ob =new Scanner (System.in);
		System.out.println("enter no.");
		int num=ob.nextInt();
		int rev=0;
		int rem;
		int total=num;
		while(num>0)
		{
			rem=num%10;
			rev=rev+(rem*rem*rem);
			num=num/10;
			
		}
		if(rev==total)
		{
			System.out.println("Its Amstrong");
		}
		else
		{
			System.out.println("Not Amstrong");
		}

	}

}
