//Write a program to generate 10 Fibonacci numbers.
package Module1;

import java.util.Scanner;

public class Module1_19 {
	public static void main(String[] args) {
		int first=0,second=1,next;
		int i=0;   
		System.out.println("Enter limit");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
		 System.out.print(first+" "+second);      
		while(i<(n-2))
	{		   
		  next=first+second;    
		  System.out.print(" "+next);    
		  first=second;    
		  second=next; 
		  ++i;
	}
	}
	

}
