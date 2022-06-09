import java.util.Scanner;
 class Exceptionf

{

public static void main(String args[])

{ double R;

try {

Scanner s = new Scanner(System.in);

int num=s.nextInt();

if (num<0)

throw new MyException(num); // throw is used to create a new exception and throw it.

else
{
R= Math.sqrt(num);
 System.out.println("The square root of " + num+" is "+R);
}
}

catch(MyException e) 
{
  System.out.println(e) ;
}
}
}

class MyException extends Exception
{
int a;

MyException(int b)

{a=b; }

public String toString() {
return ("Exception: Square root of "+a+" is Complex"); }
}
