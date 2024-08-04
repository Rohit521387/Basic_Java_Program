package basics.programs;

public class StringFunctions 
{

	public static void main(String[] args) 
	{
		String a = "I love my india";
		char a1 = a.charAt(5);
		System.out.println(a1);
		
		int b= a.indexOf('n');
		System.out.println(b);
		
		String name="    I love my india      ";
		String c = name.trim();
		System.out.println(c);
		
		String d= a.substring(4);
		System.out.println(d);
		
		String f = a.substring(0, 10);
		System.out.println(f);
		
		String input ="Manish Kumar Tiwari";
		String g =input.substring(7, 12);
		System.out.println(g);
	
	}

}
