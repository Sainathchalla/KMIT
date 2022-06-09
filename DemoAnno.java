class A
{
	public void showMyDataFromLastYearDatabase(int a)
	{
		System.out.println("I am in class A");
	}
}
class B extends A
{
    //@Override
	public void showMyDataFromLastYearDatabase(double b)
	{
		System.out.println("I am in class B");
	}
}
public class DemoAnno
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.showMyDataFromLastYearDatabase(4.5);
	}
}
