//Extend the previous program to check whether the given number is positive, zero or negative.
package Module1;

import java.util.Scanner;

public class Module1_5 {
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Scanner obj =new Scanner(System.in);		
		int num=obj.nextInt();
		if(num>0){
			System.out.println("Positive Number");
		}
		else if(num==0){
			System.out.println("Zero");
		}
		else {
			System.out.println("Negative Number");
		}

}
}
