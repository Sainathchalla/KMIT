import java.util.*;
public class Palindrome
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		if(palin(str))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
	public static boolean palin(String str)
	{
		int n=str.length();
		int i=0;
		int j=n-1;
		char[] ch=str.toCharArray();
		while(i<j)
		{
			if(ch[i]==ch[j])
			{
				i++;
				j--;
			}
			else
			{
				return false;
			}
		}
		return true;
	}
	
}
