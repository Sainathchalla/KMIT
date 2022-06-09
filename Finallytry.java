class Finallytry
{
	public static void main(String args[])
	{
		try
		{
			int data=25/0;
			System.out.println(data);
		}
		catch(NullPointerException e){
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally block executed");
		}
		System.out.println("rest of code");
	}
}
