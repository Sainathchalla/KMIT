import java.util.*;
public class Revnum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=revn(n);
		System.out.println("m");
	}
	public static void revn(int n);
	{
		while(n!=0)
		{
			int dig,rev=0;
			dig=n%10;
			rev=rev*10+dig;
		}
		return rev;
	}
}
