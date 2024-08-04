package basics.programs;

public class Constructor_Overloading 
{
	Constructor_Overloading(int a)
	{
		System.out.println("Int datatype");
	}
	Constructor_Overloading(boolean b)
	{
		System.out.println("Boolean datatype");
	}
	Constructor_Overloading(char c)
	{
		System.out.println("Char datatype");
	}
	Constructor_Overloading(String a)
	{
		System.out.println("String datatype");
	}
	public static void main(String[] args) 
	{
		/*Constructor_Overloading c1=new Constructor_Overloading("Automation Testing");
		  Constructor_Overloading c2=new Constructor_Overloading('A');
		  Constructor_Overloading c3=new Constructor_Overloading(true);
		  Constructor_Overloading c4=new Constructor_Overloading(35);*/
          
		new Constructor_Overloading("Automation Testing");
		new Constructor_Overloading('A');
		new Constructor_Overloading(true);
		new Constructor_Overloading(35);
	}

}
