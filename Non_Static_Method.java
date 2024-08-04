package basics.programs;

public class Non_Static_Method 
{
    void add()
    {
    	System.out.println("Addition");
    }
	void substract()
	{
		System.out.println("Substraction");
	}
    public static void main(String[] args) 
	{
    	Non_Static_Method n1=new Non_Static_Method();
    	n1.add();
    	n1.substract();

	}

}
