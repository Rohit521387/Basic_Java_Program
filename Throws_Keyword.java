package basics.programs;

public class Throws_Keyword 
{

	public static void main(String[] args) throws NullPointerException, InterruptedException
	{   
		System.out.println("Rohit");
		Thread.sleep(7000);
		System.out.println("Student");
		throw new NullPointerException("Sorry the cell is empty");

	}

}
