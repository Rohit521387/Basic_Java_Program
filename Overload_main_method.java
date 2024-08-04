package basics.programs;

public class Overload_main_method 
{
	public static void main()
	{
		System.out.println("5");
	}
	public static void main(String Your_name)
	{
		System.out.println("rohit");
	}
	public static void main(double salary)
	{
		System.out.println("1.75");
	}
	public static void main(String[] args) 
	{
		main(2.89);
		main("Rohit");
		main();

	}

}
