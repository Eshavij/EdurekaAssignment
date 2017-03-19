//Write programs to use all the data types and given arithmetic operations.

package Module1;

public class Module1_1 {
	public static void main(String[] args) {
		
		Int obj1 = new Int();
		obj1.add();
		
		Char obj2 = new Char();
		obj2.Con();
		
		Float obj3 = new Float();
		obj3.add();
		
		Short obj4 = new Short();
		obj4.add();
		
		Long obj5 = new Long();
		obj5.add();
		
		Byte obj6 = new Byte();	
		obj6.add();
		
		Double obj7 = new Double();
		obj7.add();
		
		Addition obj8=new Addition();
		obj8.add();
		
		Multiplication obj9=new Multiplication();
		obj9.mul(); 
		
		Division obj10=new Division();
		obj10.div();
}
}

class Int {

int x = 10;
int y = 20;

void add() {
	
	int z = x + y;
	
	System.out.println("The Int Value is : " + z);
}
}
class Char {

char a = 'E';
char b = 'S';
char c = 'H';
char d = 'A';

void Con() {

System.out.println("The Characters Value is : " + a+b+c+d);
}
}
class Float {

float a = (float) 5.50;
float b = (float) -3.27;

void add() {

float c = a + b;

System.out.println("The Float Vaue is : " + c);
}
}
class Short {

short x = 765;
short y = 767;

void add() {

short z = (short) (x + y);

System.out.println("The Short Value is : " + z);
}
}
class Long {

long a = 1354L;
long b = -5000L;

void add() {

long c = a + b;

System.out.println("The Long Value is : " + c);
}
}
class Byte {

byte x = 2;
byte y = (byte) 456;

void add() {

byte z = (byte) (x + y);

System.out.println("The Byte Value is : " + z);
}
}
class Double {

double a = 9353;
double b = -3466;

void add() {

double c = a + b;
System.out.println("The Double Value is : " + c);
}

}
class Addition{
	
int a=45;
int b=78;
int c=a+b;
void add(){
	
System.out.println("The sum is:"+c);
}
}
class Subtraction{
	
int a=500;
int b=200;
int c=a-b;
void sub(){
	
System.out.println("The subtraction of two numbers is: "+c);
}
}
class Multiplication{
int a=8;
int b=6;
int c=a*b;
void mul(){
	
System.out.println("Multiplication of two numbers:"+c);
}
}
class Division{
int a=400;
int b=40;
int c=a/b;
void div(){
	
System.out.println("Division of two numbers is"+c);
}
}

