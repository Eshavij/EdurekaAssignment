//Write a program to print tables of 5 by creating a new thread and display 20 even numbers as a task of main thread.
package Module4;

public class Module4_4 {
	public static void main(String[] args)
	{
		Runnable r=new CreateThread();
		Thread t1=new Thread(r);
		t1.start();
		Thread t2=new Thread()
		{
			public void run()
			{
				for(int i=0;i<=40;i+=2)
				{   if(i%2==0)
				{
					System.out.println(i);
				}
				}
			}
		};
	
		t2.start();
		
	}
		
}

	class CreateThread implements Runnable
	{ public void run(){
		for(int i=1;i<=10;i++)
		{
			int n=5*i;
			System.out.println("5*"+i+"="+n);
		}
	}
	}
	

