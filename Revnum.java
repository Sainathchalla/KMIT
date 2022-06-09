import java.util.*;
public class Revnum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=revn(n);
		revn(n);
		System.out.println(m);
	}
	public static int revn(int n)
	{
	    int rev=0;
	    int dig;
		while(n!=0)
		{
		    //int dig;
			dig=n%10;
			rev=rev*10+dig;
			n=n/10;
		}
		return rev;
		//System.out.println(rev);
	}
}
