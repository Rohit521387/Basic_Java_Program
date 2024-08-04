package basics.programs;
interface Email
{
	void Email_as_un();
	
}
interface Mobile_no
{
	void Mobile_no_as_un();
		
}
public class Facebook_login implements Email, Mobile_no
{
	public void Email_as_un()
	{
		System.out.println("Login Successful");
	}

	public void Mobile_no_as_un() 
	{
		
		System.out.println("Login unsuccessful");
	}
	
	public static void main(String[] args) 
	{
		Facebook_login T1=new Facebook_login();
		T1.Email_as_un();
		T1.Mobile_no_as_un();
		
	}

	
}
