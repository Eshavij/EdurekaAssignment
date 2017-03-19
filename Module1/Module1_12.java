//Write a program to reverse the digits of a number.

package Module1;

import java.util.Scanner;

public class Module1_12 {
	public static void main(String[] args) {
		System.out.println("Enter the number");
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int r=0;
		int rem=0;
		int l=String.valueOf(a).length();
		for(int i=0;i<l;i++)
		{
			r=r*10;
			rem=a%10;
			System.out.print(rem);		
		     r=r+rem;
		     a=a/10;
	}

}
}
