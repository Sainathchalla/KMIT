import java.util.*;
public class Palinstr
{
	public static void main(String args[])
	{
		System.out.println("Enter string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		palinstr(str);
	}
	public static void palinstr(String str)
	{
	    char[] arr=str.toCharArray();
	    int length=arr.length;
	    System.out.println(length);
	    String strrev="";
	    for(int i=length-1;i>=0;i--)
	    {
	        System.out.print(arr[i]);
	    } 
	    for(int i=length-1;i>=0;i--)
	    {
	       strrev=strrev+str.charAt(i);
	    }
	    System.out.println();
	    System.out.println(strrev);
	    StringBuffer obj=new StringBuffer(str);
	    System.out.println(obj.reverse());
	    StringBuilder s=new StringBuilder(str);
	    System.out.println(s.reverse());
    }
}
