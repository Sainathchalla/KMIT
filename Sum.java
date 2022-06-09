class Sum
{
  public static void main(String args[])
   {
     Sum obj=new Sum();
     obj.methodtwo();
   }
 void methodone()
   {
     System.out.println("Inside methodone");
   }
 void methodtwo()
  {
   System.out.println("Inside methodtwo"); 
   this.methodone();
  }
}