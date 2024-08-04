// Program to achive 0% abstraction
package basics.programs;
abstract class Grand_Parent1
{
	abstract void add();
}
abstract class Parent_Class1 extends Grand_Parent1
{
	void subtract()
	{
		System.out.println("I am Rohan");
	}

	
}
public class Child_Class1 extends Parent_Class1
{
    void multiply()
    {
    	System.out.println("I am Rohit");
    }
    void add() 
	{
		
		System.out.println("I am Kadam");
	}
	public static void main(String[] args) 
	{
		Child_Class1 t1 =new Child_Class1();
		t1.add();
		t1.subtract();
		t1.multiply();

	}

}
