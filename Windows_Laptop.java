//Abstract Class and Abstract Method
package basics.programs;

abstract class Command_Prompt
{
	abstract void add();
}
public class Windows_Laptop extends Command_Prompt  //Concrete Class
{
	void add() 
	{
		System.out.println("I am Rohit Kadam");
		
	}
	public static void main(String[] args) //Concrete Method
	{
		Windows_Laptop t1=new Windows_Laptop();
		t1.add();

	}

	
	

}
