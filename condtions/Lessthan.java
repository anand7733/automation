package condtions;

public class Lessthan {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		if(a>b || a<c && a<b && a>c)
		{
			System.out.println("True");
			
		}
		else {
			System.out.println("False");
		}
	}

}
