//How to update the value of an array
package basics.programs;

import java.util.Arrays;

public class Update_Array_Value 
{

	public static void main(String[] args) 
	{
		int rollno[] = new int[3];
		rollno[0] = 90;
		rollno[1] = 70;
		rollno[1] = 120;
		rollno[2] = 150;
		
		System.out.println(Arrays.toString(rollno));

	}

}
