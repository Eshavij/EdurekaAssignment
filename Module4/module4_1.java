package Module4;

public class module4_1 {
	public void sub(int x,int y)
	{
		int z=x-y;
		System.out.println("sub: "+z);
	}
	public void add(int x,int y)
	{
		int z=x+y;
		System.out.println("add: "+z);
	}
	public void mul(int x,int y)
	{
		int z=x*y;
		System.out.println("mul: "+z);
	}	
	public static void div(int x,int y) throws Exception
	{
			int z=x/y;
			System.out.println("sub: "+z);	
	}
	public void fact(int x) 
	{
	int fact=1;
	for(int i=1;i<=x;i++){
	fact=fact*i;
	}
	System.out.println("Factorial of "+x+" is: "+fact);
	}
	public void rev(int x)
	{
		int r=0;
		while(x!=0)
		{
			r=r*10;
		     r=r+x%10;
		     
		     x=x/10;
	}
		System.out.println("Rev is: "+r+"\t");	
	}

}
