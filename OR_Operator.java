package basics.programs;

public class OR_Operator 
{

	public static void main(String[] args) 
	{
		int age=10;
		char gender ='F';
        if(age>=18 || gender=='F')
        {
        	System.out.println("Person can vote");
        }
	    if(!(age>=18 || gender=='F'))
        {
    	System.out.println("Person can vote");
        }
	
	}
}
