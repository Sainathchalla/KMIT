import pack1.Addition;
public class Nest
{
  public static void main(String args[])
   {
      Addition o1=new Addition();
      o1.sum();
      Addition.Subtract o2=new Addition.Subtract();
      o2.subtraction();
   }
}