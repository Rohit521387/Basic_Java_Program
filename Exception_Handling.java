package basics.programs;
public class Exception_Handling 
{
public static void main(String[] args) 
{
	   try
	   {
		   int a=1/1;
		   System.out.println(a);
	   }

	   catch(ArithmeticException b)
	   {
		   System.out.println("I am happy");
	   }
}
}
