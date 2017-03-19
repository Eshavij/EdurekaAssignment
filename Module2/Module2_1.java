package Module2;

import java.util.Scanner;

public class Module2_1 {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	    int empId[]=new int[5];
	    String ename[]=new String[5];
	    int sal[]=new int[5];
	    
		for(int i=0;i<2;i++){
			
		System.out.println("Enter emp Id");
		empId[i]=sc.nextInt();
		System.out.println("Enter the name");
		ename[i]=sc.next();
		System.out.println("Enter the salary");
		sal[i]=sc.nextInt();
		}
		System.out.println("ID		Name		Salary");
		for(int i=0;i<2;i++){
		display(empId[i],ename[i],sal[i]);
		}
	}
		static void display(int EmpId, String Ename,int Sal){
			
            System.out.println(EmpId+"\t\t"+Ename+"\t\t"+Sal);		
	}

}
