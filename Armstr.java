import java.util.*;
public class Armstr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		arm(a);
	}
	public static void arm(int n)
	{
		int sum=0;
		int p=n;
		while(n!=0)
		{
			int rem=n%10;
			sum+=rem*rem*rem;
			n=n/10;
		}
		if(sum==p)
		{
		   	System.out.println("Armstrong");
		}
		else
		    System.out.println("Not a Armstrong");
	}
}
