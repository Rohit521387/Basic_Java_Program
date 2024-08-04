package basics.programs;

public class Array_Average_Program 
{

public static void main(String[] args) 
{
		int no[] = new int [4];
		no[0] = 10;
		no[1] = 05;
		no[2] = 03;
		no[3] = 02; 
		
	//	int number[] = { 10,20,30,40 };
		
		
		int sum=0;
		double average=0;

		
		for(int i=0; i<no.length; i++)
		{
			
			sum=sum+no[i];
			average = sum / no.length;
			
		}
		System.out.println("Average value of 4 no's is --> "+average);

}

}
