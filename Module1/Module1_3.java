//Write a program to check if a candidate is eligible for voting or not. (Hint: Check age)

package Module1;

import java.util.Scanner;

public class Module1_3 {
	public static void main(String[] args) {
		System.out.println("Enter your age:");
		Scanner obj =new Scanner(System.in);
		int age=obj.nextInt();
		if(age>=18)
		{
			System.out.println("Candidate is eligible for voting");
		}
		else
		{
			System.out.println("Candidate is not eligible for voting ");
		}

}
}
