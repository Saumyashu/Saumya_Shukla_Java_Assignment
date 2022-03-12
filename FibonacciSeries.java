package hello;
import java.util.*;

public class FibonacciSeries {
	public static void main (String args[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Please Enter number of series");
		int i = scn.nextInt();
		int a=1,b=1,c,j; 
		float n=0;
		 if (i == 1)
		 {
			 System.out.print("The first "+i+" Fibonacci numbers are: ");
			 System.out.println(a);
			 System.out.println("The average is "+a/i);
			 }   
		 else if (i == 2)
		 {
			 System.out.print("The first "+i+" Fibonacci numbers are: ");
		     System.out.println(a+" "+b);  
		     n = a+b;
		     System.out.println("The average is "+n/i);
		  }  
		 else 
		 { 
	     System.out.print("The first "+i+" Fibonacci numbers are: ");	 
		 System.out.print(a+" "+b); 
		 n=a+b;
		 for(j=2;j<i; j++)  {    
		  c=a+b;    
		  System.out.print(" "+c); 
		  n=n+c;
		  a=b;    
		  b=c;    
		 }  
		 System.out.println(" ");
		 System.out.println("The average is "+n/i);
		  }
		}
		

	}


