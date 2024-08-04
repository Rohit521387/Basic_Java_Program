package basics.programs;
public class Method_Overloading 
{
    static void add(int a)
    {
    	int sum=a+6;
    	System.out.println(sum);
    }
    static void add(int a, int b)
    {
    	int sum=a+b+6;
    	System.out.println(sum);
    }
    static void add(double a)
    {
    	double sum=a+6;
    	System.out.println(sum);
    }
    static void add(int a, double b, double c)
    {
    	double sum=a+b+c;
    	System.out.println(sum);
    }
	public static void main(String[] args) 
	{
		add(100);
		add(200,300);
		add(6.789);
		add(50,56.787,77.789);

	}

}
