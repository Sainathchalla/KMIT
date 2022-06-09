import java.util.Scanner;
public class Operations
{
	public static void main(String args[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n1=obj.nextInt();
		System.out.println("Enter the number:");
		int n2=obj.nextInt();
		System.out.println("Enter the operator.. *,+,-,/,^:");
		char c=obj.next().charAt(0);
		if(c=='*')
		{
		    System.out.println(n1+""+c+""+n2);
			System.out.println(n1*n2);
		}
		else if(c=='+')
		{  
		    System.out.println(n1+""+c+""+n2);
			System.out.println(n1+n2);
		}
		else if(c=='-')
		{
		    System.out.println(n1+""+c+""+n2);
			System.out.println(n1-n2);
		}
		else if(c=='/')
		{
		    System.out.println(n1+""+c+""+n2);
			System.out.println(n1/n2);
		} 
		else
		{
		    System.out.println(n1+""+c+""+n2);
		    System.out.println(n1^n2);
	    }
	}
}
