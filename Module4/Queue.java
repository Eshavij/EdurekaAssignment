////Write a program to define a queue interface and have insert and delete methods in the interface. Implement these methods in a class.
package Module4;

import java.util.Scanner;

	interface Queue {
		public void insert();
		}

	class MethOne  implements Queue
		{	
		Scanner sc =new Scanner (System.in);
		int limit=sc.nextInt();
		int a[]=new int[limit];
			@Override
			public void insert() {
				int front=-1;
				int rear=-1;
				System.out.println("Enter values for queue");
				for(int i=0;i<limit;i++)
				{
				if(rear==limit-1)
				{
				System.out.println("Stack overflow");	
				}
				else
				{
					rear=rear+1;
					a[rear]=a[i];
				}
				}
			}
			
	}
	class Main{
		public static void main(String args[]){
			 MethOne obj=new  MethOne ();
			obj.insert();
		}
	}


