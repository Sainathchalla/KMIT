import java.io.*;
class Throwsk
{
	int[] arr = new int[3];
	void myMethod(int num) throws ArithmeticException,IndexOutOfBoundsException
	{
		if(num==1)
		System.out.println(arr[1]/arr[0]);
		else
		System.out.println(arr[3]);
	}
}
class Throwsa
{
	public static void main(String args[])
	{
		Throwsk obj=new Throwsk();
		try
		{
			obj.arr[0]=0;
			obj.arr[1]=1;
			obj.myMethod(5);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Div by 0"+e);
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
	}
}
