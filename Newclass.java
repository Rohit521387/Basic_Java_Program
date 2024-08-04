package basics.programs;

abstract class Newclasstwo
{
	abstract void add();
	abstract void subtract();
	
}
abstract class Newclassone extends Newclasstwo
{
	abstract void add1();
	abstract void subtract1();
	void mod()
	{
		int a=2;
	    int b=2;
	    int mod=2%2;
		System.out.println("Modulus is "+mod);
	}
}
public class Newclass extends Newclassone
{
	static void mul()
	{
		int a=2;
	    int b=2;
	    int mul=2*2;
		System.out.println("Multiplication is "+mul);
		
	}
	void divide()
	{
		int a=2;
	    int b=2;
	    int divide=2/2;
		System.out.println("Division is "+divide);
	}
	void add1() 
	{
		int a=22;
	    int b=2;
	    int add1=22+2;
		System.out.println("addition is "+add1);
		
	}
	void subtract1() 
	{
		int a=2;
	    int b=2;
	    int subtract1=2-2;
		System.out.println("Subtraction is "+subtract1);
		
	}
	void add() 
	{
		int a=2;
	    int b=2;
	    int add=2+2;
		System.out.println("Addition is "+add);
		
	}
	void subtract() 
	{
		int a=22;
	    int b=2;
	    int subtract=22-2;
		System.out.println("Subtraction is "+subtract);
		
	}

	public static void main(String[] args) 
	{
		Newclass N1=new Newclass();
		N1.mul();	
		N1.divide();
		N1.add1();
		N1.subtract1();
		N1.add();
		N1.subtract();
		N1.mod();
		
		

	}
	
	
}
