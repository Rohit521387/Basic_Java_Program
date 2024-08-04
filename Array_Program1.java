// I want to store 5 students rollno together.
package basics.programs;

import java.util.Arrays;

public class Array_Program1 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int [5];
		rollno[0] = 21;
		rollno[1] = 24;
		rollno[2] = 32;
		rollno[3] = 40;
		rollno[4] = 50;
		
      System.out.println(Arrays.toString(rollno));
	
//Program to store 5 names together	
	
	    String name[]=new String[5];
	    name[0] = "Rohit";
	    name[1] = "Ajay";
	    name[2] = "Mayur";
	    name[3] = "Priyanka";
	    name[4] = "Pooja";
	    
	    System.out.println(Arrays.deepToString(name));
	
	
	}
	

}
