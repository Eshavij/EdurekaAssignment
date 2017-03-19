//Write a program to reverse the digits of a number.
package Module1;

import java.util.Scanner;

public class Module1_18 {
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter no");
		int num=sc.nextInt();
	    int rev=0,rem;
	   while(num!=0){    	
	    	rem=num%10;
	    	rev=rev*10+rem;
	    	num=num/10;
	   }
	   System.out.print("Reverse of a number "+rev);
	

	}
		
	}



