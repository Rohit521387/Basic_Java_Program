package basics.programs;
class Method_Parent
{
	void Login()
	{
		System.out.println("Enter your Mobile No");
	}
}
public class Methodoverriding extends Method_Parent
{
    void Login()
    {   
    	super.Login();
    	System.out.println("Enter your E-mail ID");
    }

	public static void main(String[] args) 
	{
		Methodoverriding M1=new Methodoverriding();
		M1.Login();

	}

}
