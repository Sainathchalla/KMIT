public class Throwe
{
	static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Not valid to vote");
		}
		else
		System.out.println("Welcome to vote");
	}
	public static void main(String args[])
	{
	   try
	   {
		validate(13);
	   }
	   catch(ArithmeticException e)
	   {
	    System.out.println("catch block"+e);
		System.out.println("Rest of code");
	    }
	}
}
