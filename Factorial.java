import java.util.Scanner;
public class Factorial
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=obj.nextInt();
		int j=fact(n);
		System.out.println(j);
    }
    public static int fact(int n)
    {
        if(n==0)
        {
          return 1;
        }
        else
        {
          return n*fact(n-1);
        }
    }
}

