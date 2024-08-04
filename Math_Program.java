package basics.programs;

public class Math_Program 
{

	public static void main(String[] args) 
	{
      
		double pivalue= Math.PI;
		System.out.println(pivalue);
		
      System.out.println(Math.addExact(100, 200));
      System.out.println(Math.subtractExact(300, 200));
      System.out.println(Math.multiplyExact(10, 10));
      System.out.println(Math.floorDiv(10, 2));
      System.out.println(Math.max(100, 200));
      System.out.println(Math.max(57.345, 8.5575));
      System.out.println(Math.min(5, 10));
      System.out.println(Math.sqrt(9));
      System.out.println(Math.random());
      

	}

}
