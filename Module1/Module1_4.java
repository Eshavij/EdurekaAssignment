////Write a program to check if the number is positive or negative.
package Module1;

import java.util.Scanner;

public class Module1_4 {
	
	public static void main(String[] args) {
		
		System.out.println("Enter the number:");
		Scanner obj =new Scanner (System.in);		
		int num=obj.nextInt();
		if(num>0){
			System.out.println("It is a positive Number");
		}
		else 
		{
			System.out.println("It is a negative Number");
		}

}
}
