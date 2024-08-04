//Multilevel inheritance using static method
package basics.programs;
class Mumbai
{
	static void method_mumbai()
	{
		
	}
}
class Chennai extends Mumbai
{
	static void method_chennai()
	{
		
	}
	
}
public class Bangalore extends Chennai
{
    static void method_Bangalore()
    {
    	
    }
	public static void main(String[] args) 
	{
		method_mumbai();
		method_chennai();
		method_Bangalore();

	}

}
