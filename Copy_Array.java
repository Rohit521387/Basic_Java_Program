//Copy the value of one array into another array using iteration.
package basics.programs;

import java.util.Arrays;

public class Copy_Array 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int[5];
		
		rollno[0] = 10;
		rollno[1] = 20;
		rollno[2] = 30;
		rollno[3] = 40;
		rollno[4] = 50;
		
		int rollno_Copied[] = new int[rollno.length];
		
		for(int i=0; i< rollno.length; i++)
		{
			rollno_Copied[i] = rollno[i];
		}
		
		System.out.println(Arrays.toString(rollno_Copied));
		System.out.println(Arrays.toString(rollno));
		
		     boolean  FinalAnswer =   Arrays.equals(rollno, rollno_Copied);
		     
		     if (FinalAnswer == true)
		     {
		    	 System.out.println("The 2 Arrays are exactly equal to each other");
	
		     }
		     else
		     {
		    	 System.out.println("The 2 arrays are not exactly equal to each other");
		     }
	
	
	}
}
