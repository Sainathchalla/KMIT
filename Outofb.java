public class Outofb
{
	public static void main(String args[])
	{
		try
		{
			int a[]=new int[5];
			a[5]=30/0;
			a[5]=6;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		} 
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
	/*	catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		} */
		catch(Exception e)
		{
			System.out.println("Common task  "+e);
		}
		System.out.println("Rest of code");
	}
}
