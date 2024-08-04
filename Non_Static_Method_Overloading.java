package basics.programs;

public class Non_Static_Method_Overloading 
{
    void add(double a)
    {
    	double sum =6+a;
    	System.out.println(sum);
    }
    void add(int a)
    {
    	int sum=5+a;
    	System.out.println(sum);
    }
	public static void main(String[] args)
	{
		Non_Static_Method_Overloading n1=new Non_Static_Method_Overloading();
		n1.add(90);
		n1.add(56.789);

	}

}
