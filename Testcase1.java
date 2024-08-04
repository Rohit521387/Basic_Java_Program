//Super Calling Statement / Super();
package basics.programs;
class Set_URL
{
	Set_URL(int age)
	{   
		super();
		System.out.println("Set URL");
	}
}
class Launch_The_Browser extends Set_URL
{
	Launch_The_Browser(String Google_Chrome)
	{   
		super(80);
		System.out.println("Launch_The_Browse");
	}
	
}
public class Testcase1 extends Launch_The_Browser
{
	Testcase1()
	{
		super("Rohit");
		System.out.println("Testcase1");
	}

	public static void main(String[] args) 
	{
		Testcase1 T1=new Testcase1();
		

	}

}
