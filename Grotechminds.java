package basics.programs;
interface Amazon
{
	void login_with_mobile_no();
	void login_with_email_id();
}
public class Grotechminds implements Amazon
{
	public void login_with_mobile_no() 
	{
		
		System.out.println("Keep the real logic");
	}

	public void login_with_email_id() 
	{
		System.out.println("Keep the real logic");
		
	}
public static void main(String[] args) 
{
	Grotechminds T1=new Grotechminds();
	T1.login_with_mobile_no();
	T1.login_with_email_id();

}

}


