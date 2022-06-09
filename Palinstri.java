import java.util.*;
public class Palinstri
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		strpal(str);
	}
	public static void strpal(String str)
	{
		int n=str.length();
		int i=0;
		String str1=str;
		while(i<n/2)
		{
			char temp=str.charAt(i);
			str.charAt(i)=str.charAt(n-1-i);
			str.charAt(n-1-i)=temp;
			i++;
		}
		if(str1==str)
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
	}
}
