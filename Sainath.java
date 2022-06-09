import java.util.Scanner;
class Sainath
{
private static int r,area,volume;
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("Enter the radius of sphere : ");
r=s.nextint();
volume=(4/3)*3.14*r*r*r;
area=4*3.14*r*r;
System.out.println("Volume is : "+volume);
System.out.println("Area is : "+area);
}
}