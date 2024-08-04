package basics.programs;

import java.util.Arrays;

public class Equals_Ignore_Case 
{

	public static void main(String[] args) 
	{
		String s1 = "ROhit";
		String s2 = "";
		String s3 = "Rohit";
		String s4 = "My name is Rohit";
		System.out.println(s1.equalsIgnoreCase("rohit"));
		System.out.println(s2.isEmpty());
		System.out.println(s3.endsWith("t"));
		
		//s5[0] = My
		//s5[1] = name
		//s5[2] = is
		//s5[3] = Rohit
		
		
	    String s5[] = s4.split(" ");
	   // System.out.println(s5[0]);
	    System.out.println(Arrays.toString(s5));
	    
	    String  s6[] = s4.split(" ", 3);
	    System.out.println(Arrays.toString(s6));
	    
	    String s7 = "Rohit";
	    String b = s7.repeat(5);
	    System.out.println(b);
	    

	}

}
