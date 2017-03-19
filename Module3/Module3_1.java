package Module3;

import java.util.Scanner;

public class Module3_1 {
	public static void main(String args[]){
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the type of account");
		String type=sc.next();
		}
	}
	abstract class SB_Account{
		int Account_number;
		String name;
		int amount;
		abstract void  withdraw();
		abstract void  deposit();
	}
	class Current_Account extends SB_Account{
	void withdraw(){
			
		}
		void deposit(){
			
		}
	

}
