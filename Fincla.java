class X
{
  void getMethod()  //overridden
  {
    System.out.println("X method called");
  }
}
class Y extends X
{
 // void getMethod()  //overriding
 // {
   // System.out.println("Y method called");
  //}
}
public class Fincla
{
  public static void main(String args[])
  {
    Y obj=new Y();
    obj.getMethod();
     obj.getMethod();
  }
}