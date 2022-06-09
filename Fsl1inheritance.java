public class Fsl1inheritance extends Shape
{
   public static void main(String args[])
  {
     Shape r=new Shape();
     r.length=10;
     r.breadth=20;
     r.calculateArea();
     System.out.println("Area = "+r.area+"length = "+r.length+"breadth="+r.breadth);
  }
}
class Shape
{
    int length;
    int breadth;
    int area;
    public void calculateArea()
  {
    area=length*breadth;
  }
}