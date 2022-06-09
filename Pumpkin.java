public class Pumpkin
{
  public static void main(String args[])
   {
     Shape s=new Circle();
     Circle c=new Shape();
     s.draw();
   }
}
class Shape
{
  public void draw()
   {
     System.out.println("Shape");
   }
}
class Circle extends Shape
{
   public void draw()
   {
     System.out.println("Circle");
   }
}