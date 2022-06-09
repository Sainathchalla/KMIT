import java.util.*;
public class Revstr
{
	static int n;
	static char temp;
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		rev(str);
	}
	public static void rev(String str)
	{
		char[] ch=str.toCharArray();
		n=str.length();
		for(int i=0;i<n/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[n-1-i];
			ch[n-1-i]=temp;
		}
		for(int i=0;i<n;i++)
		{
		   System.out.print(ch[i]);
	    }
	}
}
