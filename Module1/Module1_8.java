//Write a program to print 10 even numbers and 10 odd numbers.(using for loop)
package Module1;

public class Module1_8 {
	public static void main(String[]args){
		for(int i=1;i<=20;i++)
		{
			if(i%2==0)
			{
				System.out.println("Even: "+i+" ");
			}
			else{
				System.out.println("Odd: "+i+" ");
			}
		}
		
	}

}
