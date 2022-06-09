import java.util.*;
class A
{
	public void showMyDataFromLastYearDatabase()
	{
		System.out.println("I am in class A");
	}
}
class B extends A
{
    @Override
    @SuppressWarnings("unchecked")
	public void showMyDataFromLastYearDatabase()
	{
		ArrayList<Integer> obj1=new ArrayList(); 
		System.out.println("I am in class B");
	}
}
public class Demosupp
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.showMyDataFromLastYearDatabase();
	}
}
