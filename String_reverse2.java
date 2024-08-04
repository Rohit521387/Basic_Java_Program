package basics.programs;

public class String_reverse2 
{

	public static void main(String[] args) 
	{
		String name = "RADAR";
	    String input= name.toLowerCase();
	    String reverse="";
	    
	    for (int i=input.length()-1; i>=0; i--)
	    {
	    	char c1= input.charAt(i);
	    	reverse=reverse+c1;	
	    	
	    }	
	      System.out.println(reverse);
	      
	    boolean result = input.equals(reverse);
	    
	    System.out.println(result);
	    
	    if (result == true)
	    {	
	    	System.out.println("It is a Palindrome");
	    }	
	    else
	    {
	    	System.out.println("It is not a Palindrome");
	    }

	}

}
