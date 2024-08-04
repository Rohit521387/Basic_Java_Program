//Single_Inheritance using Non static Method
package basics.programs;

class ParentClass
{
	void add()
	{
		int a=10;
		int b=5;
		int sum=a+b;
		System.out.println(sum);
				
	}
}
public class ChildClass extends ParentClass
{
	void sub()
	{
		int a=10;
		int b=5;
		int sub=a-b;
		System.out.println(sub);
				
	}
	public static void main(String[] args) 
	{
		ChildClass c1=new ChildClass();
		c1.sub();
		c1.add();
		

	}

}
