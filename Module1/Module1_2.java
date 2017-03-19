//Write a program to perform all the arithmetic operations given in the table.

package Module1;

public class Module1_2 {
	
	public static void main(String[] args) {
		
		Add obj1=new Add();
		obj1.add();
		
		Subtraction obj2=new Subtraction();
		obj2.sub();
		
		Mul obj3=new Mul();
		obj3.mul();
		
		Div obj4=new Div();
		obj4.div();

	}
	
}

	class Add{
		int a=57;
		int b=78;
		int c=a+b;
		void add(){
		System.out.println("Addition of two numbers:"+c);
	}
	}
	class Substraction{
		int a=578;
		int b=267;
		int c=a-b;
		void sub(){
			System.out.println("Substraction of two numbers:"+c);
		}
	}

	class Mul{
		int a=5;
		int b=2;
		int c=a*b;
		void mul(){
			System.out.println("Multiplication of two numbers:"+c);
		}
	}

	class Div{
		int a=1000;
		int b=25;
		int c=a/b;
		void div(){
			System.out.println("Division of two numbers:"+c);
		}
	}


	
	


