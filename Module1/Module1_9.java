//Write a program to find factorial of a number.(using for loop)
package Module1;

import java.util.Scanner;

public class Module1_9 {
	public static void main(String []args){
			int i,fact=1;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter a number whose factorial to be calculated");
			int a=sc.nextInt();
			for(i=1;i<=a;i++){
			fact=fact*i;
			}
			System.out.println("Factorial of "+a+" is: "+fact);
	}
		
	}


