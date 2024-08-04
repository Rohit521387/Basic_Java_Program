package basics.programs;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Try_Catch_Exception 
{
public static void main(String[] args) 
{
		Scanner s1=new Scanner(System.in);
		try 
	    {
		System.out.println("Enter the valid age");	
		int age=s1.nextInt();
	
		}
        catch(InputMismatchException a1)
		{
        	System.out.println("Age must be a valid numeric value, Please enter the correct age");
        	System.out.println("Please enter the valid age");
        	Scanner s2=new Scanner(System.in);
        	int age1=s2.nextInt();
        	
		}

}
}
