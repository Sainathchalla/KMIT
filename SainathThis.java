class SainathThis
{
  SainathThis()
   {
     //this("KMIT");
     System.out.println("In default Constructor");
     this("KMIT");
   }
   SainathThis(String str)
   {
     System.out.println("In parameterized Constructor" +str);
   }
   public static void main(String args[])
   {
    SainathThis obj=new SainathThis();
   }
}