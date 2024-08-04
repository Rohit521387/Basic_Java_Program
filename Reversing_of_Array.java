//How to reverse an array using iteration and store into another array.
package basics.programs;

import java.util.Arrays;

public class Reversing_of_Array 
{
    static int k=0;
	public static void main(String[] args) 
	{
		int rollno[] = { 10,15,20,25,30 };
        int rollno_reverse[] = new int[rollno.length];
        
        for(int i=rollno.length-1; i>=0;i--)
        {
        	rollno_reverse[i] = rollno[k];
        	k++;
        }
        System.out.println(Arrays.toString(rollno));
        System.out.println(Arrays.toString(rollno_reverse));
        
	}

}
