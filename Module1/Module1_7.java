//Write a program to check given number is even or odd. (Hint: use % operator)

package Module1;

import java.util.Scanner;

public class Module1_7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int a=sc.nextInt();
	
			if(a%2==0)
			{
				System.out.println("Number is Even");
			}
			else{
				System.out.println("Number is Odd");
			}

}
}
