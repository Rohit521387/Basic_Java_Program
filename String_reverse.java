package basics.programs;

public class String_reverse 
{

	public static void main(String[] args) 
	{
		String name = "abhishek";
		
		for(int i = name.length()-1 ; i>=0; i--)
		{
			System.out.print(name.charAt(i));
		}

	}

}
