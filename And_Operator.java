package basics.programs;

public class And_Operator 
{

	public static void main(String[] args)
	{
		int age=20;
		int Salary=10000;
		
		/*if (age==18 && Salary==1000)
		{
			System.out.println("I will only execute if both are True");
		}
		if (age==20 && Salary==1000)
		{
			System.out.println("I will only execute if both are True");
		}
		if (age==20 && Salary==10000)
		{
			System.out.println("I will only execute if both are True");
		}*/
		if (!(age==18 && Salary==1000))
		{
			System.out.println("I will only execute if both are True");
		}
		if (!(age==20 && Salary==1000))
		{
			System.out.println("I will only execute if both are True");
		}
		if (!(age==20 && Salary==10000))
		{
			System.out.println("I will only execute if both are True");
		} 
		
	}

}

