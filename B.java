interface Y
{
	public void method1();
}
interface Z
{
	public void method2();	
}
abstract class A implements Y,Z
{
	public void method1()
	{
		System.out.println("Interface x's method");
	}
   abstract void method3();
   public void method2()
    {
		System.out.println("Interface y's method");
	}		
}
public class B extends A
{
    public void method3()
    {
		System.out.println("Interface y's method");
	}	
	public static void main(String args[])
	{
		B b=new B();
		b.method2();
		b.method1();
		b.method3();
	}
}
