package Module2;

import java.util.Scanner;

public class Module2_3 {
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
		System.out.println("\n");
		System.out.println("ID		Name");
		for(int i=0;i<2;i++){
			
			display(empId[i],ename[i]);
			}
		System.out.println("\n");
		System.out.println("Enter the emp name whose details you want to search");
		String name=sc.next();
		System.out.println("\n");
		System.out.println("ID		Name		Salary");
        for(int i=0;i<2;i++){
			
        	display(name,empId[i],ename[i],sal[i]);
			}
	}
		static void display(int EmpId, String Ename,int Sal){
			
            System.out.println(EmpId+"\t\t"+Ename+"\t\t"+Sal);		
	}
		static void display(int EmpId, String Ename){
			 System.out.println(EmpId+"\t\t"+Ename);
		}
        static void display(String name,int EmpId, String Ename,int Sal){
			if(name.equals(Ename)){
            System.out.println(EmpId+"\t\t"+Ename+"\t\t"+Sal);		
			}
			}
	

}
