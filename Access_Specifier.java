package basics.programs;

public class Access_Specifier 
{
   public void add()
   {
    	int a=50;
    	int b=50;
    	int sum=a+b;
    	System.out.println("Addition of 2 Numbers is "+sum );
    	
   }
   protected void sub()
   {
	   int a=100;
   	   int b=50;
   	   int sub=a-b;
   	   System.out.println("Subtraction of 2 Numbers is "+sub );
   }
   private void mul()
   {
	   int a=50;
   	   int b=50;
   	   int mul=a*b;
   	   System.out.println("Multiplication of 2 Numbers is "+mul );
   }
   void div()
   {
	   int a=50;
   	   int b=10;
   	   int div=a/b;
   	   System.out.println("Division of 2 Numbers is "+div );
   }
	public static void main(String[] args) 
	{
		Access_Specifier a1=new Access_Specifier();
		a1.add();
		a1.sub();
		a1.mul();
		a1.div();
	}

}
