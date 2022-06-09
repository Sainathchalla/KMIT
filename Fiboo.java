import java.util.*;
public class Fiboo
{
	public static void main(String args[])
	{
		System.out.println("Enter limit of Fibonacci series:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		fiboo(n);
		//int n1=sc.nextInt();
		//prime(n1);
	}
	public static void fiboo(int n)
	{
		int x=0,y=1,z=0,count=1;
		if(n==0)
		{
			System.out.println("Enter correct limit");
		}
		else
		{
		while(count<=n)
		{
		System.out.print(x+" ");
		z=x+y;
		x=y;
		y=z;
		count++;
	    }
	    }
    }
	     
}
