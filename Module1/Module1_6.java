//Write a program to find largest of two numbers.
package Module1;

import java.util.Scanner;

public class Module1_6 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a=obj.nextInt();
		int b=obj.nextInt();
        int largest=(a>b?a:b);
        System.out.println("Largest:"+largest);
	}

}
