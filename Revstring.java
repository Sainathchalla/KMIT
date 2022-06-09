import java.util.*;
public class Revstring
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		rev(str);
	}
	public static void rev(String str)
	{
		String[] words=str.split(" ");
		int i=0,m=0;
		char temp;
        while(m<words.length)
        {
		String word=words[m];	
		char[] ch=word.toCharArray();
		int n=word.length();
		for(i=0;i<n/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[n-1-i];
			ch[n-1-i]=temp;
		}
		for(i=0;i<n;i++)
		{
		   System.out.print(ch[i]);
	    }
	    System.out.print(" ");
	    m++;
	    }
	}
}
