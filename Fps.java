class Baseclass
{
  int num=100;
  Baseclass()
   {
     System.out.println("BaseClass constructor");
   }
  public void myMethod()
  {
    System.out.println("BC Overridden method"+num);
  }
}
class Fps extends Baseclass
{
  int num=200;
  Fps()
  { 
    //super();
    System.out.println("CC constructor");
  }
  public void myMethod()
  {
    super.myMethod();
    System.out.println("CC Overriding method num="+num);
    System.out.println("CC Overriding method num="+super.num);
  }
  public static void main(String args[])
  {
    Fps obj=new Fps();                        //BaseClass constructor
     obj.myMethod();
     super.myMethod();
     //super();
  }
}                                             //CC constructor
                                             // CC Overriding method
   