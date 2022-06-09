abstract class A
{
	abstract void callme();
	public void instance()
	{
		System.out.println("This is instance method");
	}
}
class Absb extends A
{
   	void callme()
	{
		System.out.println("This is abstract method call me");
	}
	public static void main(String args[])
	{
		Absb b=new Absb();
		b.callme();
		b.instance();
	}
}
