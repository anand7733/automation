package com.anand.inhert;
 
/*class Parents
{

	public void lands()
	{
		System.out.println("Lands");
	}
}	
	 public class Son extends Parents
	{
		
		public void gold() 
		{
			System.out.println("Gold");
	    }
	
	
		public static void main(String[]args)
		{
			Son ob = new Son();
			ob.lands();
			ob.gold();
		}
	}*/
class Parents{  
	 float salary=40000;  
	}  
	class Child extends Parents{  
	 int bonus=10000;  
	 public static void main(String args[]){  
	   Child p=new Child();  
	   System.out.println("Programmer salary is:"+p.salary);  
	   System.out.println("Bonus of Programmer is:"+p.bonus);  
	}  
	}  
