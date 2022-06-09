public class Fin
{
  public static void main(String args[])
   {
     int var=10;
     final int var1=24;
     System.out.println(var+1);
     System.out.println(var1);   //  Fin.java:10: error: cannot assign a value to final variable var1
                                  //   var1=var1+1;
                                    //      ^
                                   //  1 error
     System.out.println(var1+1);
     var1=var1+1;
     System.out.println(var1+1);
  }
}