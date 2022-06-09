public class Fruit
{
  Fruit()
   { 
      System.out.println("Cool");
   }
   Fruit(int x)
   { 
      System.out.println("Cool");
   }
  public void mango()
   {
     System.out.println("Sweet");
   }
  public static void main(String args[])
   {
      Fruit f=new Fruit()
        {
           public void mango()
             {
                System.out.println("Sour");
             }
        };
      f.mango();
      Fruit f1=new Fruit(3);
      f1.mango();
   }
}
