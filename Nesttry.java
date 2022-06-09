class Nesttry
{
	public static void main(String args[])
	{
		try
		{
		    float flt[]=new float[1];
		    System.out.println(flt[2]);
			try
			{
				System.out.println("gng to divide");
				int b=39/10;
			}
			catch(ArithmeticException e){
				System.out.println(e);
			}
			try
			{
				int a[]=new int[5];
				a[5]=4;
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println(e);
			}
			System.out.println("other statement");
		}
		catch(Exception e)
		{
			System.out.println("Handled");
		}
		System.out.println("Normal flow");
	}
}
