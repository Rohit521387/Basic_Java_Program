//Multilevel_Inheritance using Non static method
package basics.programs;
class Beed
{
	void method_Beed()
	{
		
	}
	
}
class Jalna extends Beed
{
	void method_Jalna()
	{
		
	}
}
public class Aurangabad extends Jalna
{
    void method_Aurangabad()
    {
    	
    }
	public static void main(String[] args) 
	{
		Aurangabad c1=new Aurangabad();
		c1.method_Aurangabad();
		c1.method_Jalna();
		c1.method_Beed();

	}

}
