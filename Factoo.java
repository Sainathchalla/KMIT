import java.util.*;
public class Factoo
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n1=factoo(n);
	}
	static int sum=0;
	public static int factoo(int n1)
	{
	    sum=sum+factoo(n-1);
    }
}
