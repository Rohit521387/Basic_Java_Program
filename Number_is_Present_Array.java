package basics.programs;

public class Number_is_Present_Array 
{
    static int no_to_check = 15;
	public static void main(String[] args) 
	{
		int rollno[] = { 10,13,15,17,19 };
		
	    for(int i=0; i<rollno.length; i++)
	    {
	    	if(no_to_check == rollno[i])
	    	{
	    		System.out.println("The no is present in the given string with index --> " +i);
	    	}
	    	
	    	
	    }
	}

}
