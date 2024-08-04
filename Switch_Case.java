package basics.programs;

import java.util.Scanner;

public class Switch_Case 
{

	public static void main(String[] args) 
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("Remember which browser to launch");
		System.out.println("Remember 1 for Firefox, 2 for Chrome, 3 for Edge, 4 for Safari");
		int a=s1.nextInt();
		switch(a)
		{
		
		case 1: 
			    System.out.println("Launching Firefox Browser");
			    break;
			    
		case 2:
			    System.out.println("Launching Chrome Browser");
			    break;
			    
		case 3:
			    System.out.println("Launching Edge Browser");
		        break;
		        
		case 4:
			    System.out.println("Launching Safari Browser");
			    break;
			    
	    default :
	    	    System.out.println("You have selected the wrong input");
	     
		
		}
		

	}

}
