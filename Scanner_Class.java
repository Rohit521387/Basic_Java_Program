package basics.programs;

import java.util.Scanner;

public class Scanner_Class 
{
    static Scanner s1=new Scanner(System.in);
	
	static void add()
	{   
		System.out.println("Enter the value of a and b for addition");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sum=a+b;
		System.out.println("The addition of 2 numbers is--> "+sum);
	}
	static void sub()
	{
		System.out.println("Enter the value of a and b for subtraction");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int sub=a-b;
		System.out.println("The substraction of 2 numbers is--> "+sub);
	}
	static void mul()
	{
		System.out.println("Enter the value of a and b for multiplication");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int mul=a*b;
		System.out.println("The multiplication of 2 numbers is--> "+mul);
	}
	static void div()
	{
		System.out.println("Enter the value of a and b for divide");
		int a=s1.nextInt();
		int b=s1.nextInt();
		int div=a/b;
		System.out.println("The division of 2 numbers is--> "+div);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		mul();
		div();
	}

}
