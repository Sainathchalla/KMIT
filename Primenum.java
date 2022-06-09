import java.util.*;
public class Primenum
{
	public static void main(String args[])
	{
		System.out.println("Enter number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		prime(n);
	}
	public static void prime(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Primenumber");
		}
		else
	        System.out.println("Not a Primenumber");
	}
}
