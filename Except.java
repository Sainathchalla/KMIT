public class Except
{
	public static void main(String a[])
	{
		int num1,num2;
		try{
		num1=0;
		num2=62/num1;    //here exception occurs so obj of ArithmeticException will be created
		System.out.println(num2);
		System.out.println("End of try block");
	    }
	    //System.out.println("Middle");    //there should be no statement between try and catch blocks
	    catch(ArithmeticException i)       //here in place of ArithmeticException we can use class names Exception and also Throwable
	    {
	       System.out.println("Divide by num zero\n"+i);  // Divide by num zero   java.lang.ArithmeticException: / by zero
		}   
		catch(Exception e) 
		{
		   System.out.println("Divide by num zero\n");
	    }  
	       System.out.println("Out of try catch block");
	}
}
