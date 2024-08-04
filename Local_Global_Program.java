package basics.programs;

public class Local_Global_Program 
{
    int age=20;
    static String name="Rohit";
	public static void main(String[] args) 
	{
	   name="Anjali";	
       System.out.println(name);
       Local_Global_Program n1=new Local_Global_Program();
       System.out.println(n1.age);
       System.out.println(n1.age=80);
	}

}
