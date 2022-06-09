import java.util.*;
public class Palin1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		//char[] ch=str.toCharArray();
	    //static int n=str.length();
	    //int i;
        if(palindrome(str))
        {
        	System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not Palindrome");
		}
		
	}
	public static boolean palindrome(String str)
	{
	    int i;
		int n=str.length();
		for(i=0;i<n/2;i++)
		{
			if(charAt[i]==charAt[n-1-i])
			{
				continue;
			}
			else
			{
				return false;
			}
			return true;
		}
	}
}
