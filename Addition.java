package pack1;
import java.util.Scanner;
public class Addition
{
  private int a,b;
  public Addition()
   {
     Scanner s=new Scanner(System.in);
     System.out.println("Values of a and b:");
     a=s.nextInt();
     b=s.nextInt();
   }
  public void sum()
    {
      System.out.println("a+b="+(a+b));
    }  
  public static class Subtract
    {
      public void subtraction()
       {
          Addition obj=new Addition();
          System.out.println("a-b="+(obj.a-obj.b));
       }
    }
}