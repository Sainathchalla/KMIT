import java.util.*;
public class Fibo
{
	static int c=1,a=0,b=1,temp;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Fibona(n);
	}
	public static void Fibona(int n)
	{
		while(c<=n)
		{
			System.out.print(a+" ");
		    temp=b;
		    b=a+b;
		    a=temp;
		    c++;
		}
	}
}
