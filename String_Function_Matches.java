//Matches String function
package basics.programs;

public class String_Function_Matches 
{

	public static void main(String[] args) 
	{
		String s1 = "Rama";
		boolean b1 =  s1.matches("....");
		System.out.println(b1);
		
		String s2 = "Rohit";
		System.out.println(s2.matches("(.*)a" ));
		
		String s3 ="Kadam";
		System.out.println(s3.matches("K(.*)"));
		System.out.println(s3.matches("(.*)m(.*)"));
		System.out.println(s3.matches(".r(.*)"));
		System.out.println(s3.matches(".a(.*)"));

	}

}
