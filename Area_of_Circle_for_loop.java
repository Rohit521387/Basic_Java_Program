package basics.programs;

public class Area_of_Circle_for_loop 
{
	static double pivalue=Math.PI;
	public static void main(String[] args) 
	{
		
		for(int i=1;i<=5;i++)
		{	
		double r=Math.random();
		double area = pivalue*r*r;
		System.out.println("The area of circle is -->"+area);
		}
			
			

	}

}
