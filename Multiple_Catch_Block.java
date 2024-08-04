package basics.programs;

import java.util.IllegalFormatException;
import java.util.InputMismatchException;

public class Multiple_Catch_Block 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		rollno[0] = 10;
		rollno[1] = 15;
		rollno[2] = 20;
		try
		{
		rollno[3] = 25;
		}
		catch( ArrayIndexOutOfBoundsException v1)
		{
			System.out.println("I am happy");
		}
		catch( NullPointerException v2)
		{
			System.out.println("I am sad");
	    }
		catch( InputMismatchException v3)
		{
			System.out.println("I am bold");
	    }
	    catch( IllegalFormatException v4)
	    {
		System.out.println("I am Naughty");
	    }
	    finally
	    {
	    	System.out.println("I am finally");
	    }
	}
}