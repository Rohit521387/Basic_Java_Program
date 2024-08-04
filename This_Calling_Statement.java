//this calling statement / this();
package basics.programs;

public class This_Calling_Statement 
{
	This_Calling_Statement(int a)
	{
		System.out.println(1);
	}
	This_Calling_Statement(int a, int b)
	{
		this(7);
		System.out.println(2);
	}
	This_Calling_Statement(int a, double b)
	{   
		this(5,10);
		System.out.println(3);
	}
	public static void main(String[] args) 
	{
		This_Calling_Statement c1=new This_Calling_Statement(5, 3.123);
		
          
	}

}
