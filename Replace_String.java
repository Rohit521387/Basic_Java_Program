//Remove all 'a' in the given name
package basics.programs;

public class Replace_String 
{

	public static void main(String[] args) 
	{
		String name = "Rama";
		String name1 = name.replaceAll("a", "");
		System.out.println(name1);
		
		String name2 =name.replaceAll("a", "R");
		System.out.println(name2);
		
		String s1="My name is Rohit";
		System.out.println(s1.replaceAll(" ", ""));
		
		String s2 = "ROhit";
		System.out.println(s2.replaceAll("[A-Z]",""));
		System.out.println(s2.replaceAll("[a-z]", ""));
		
		String s3 ="My roll no is 3456";
		System.out.println(s3.replaceAll("[0-9]","" ));
		

	}

}
