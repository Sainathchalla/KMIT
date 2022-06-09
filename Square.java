abstract class Shape
{
	abstract double getarea(double length);
	abstract double getperimeter(double length);
}
class Circle extends Shape
{
   	double getarea(double length)
	{
		double area1=3.14*length*length;
		return area1;
		//System.out.println(area1);
	}
	double getperimeter(double length)
	{
		double per1=2*3.14*length;
		return per1;
		//System.out.println(per1);
	}
}
class Square extends Shape
{
   	double getarea(double length)
	{
		double area2=length*length;
		return area2;
		//System.out.println(area2);
	}
	double getperimeter(double length)
	{
		double per2=4*length;
		return per2;
		//System.out.println(per2);
	}
	public static void main(String args[])
	{
		Square b=new Square();
		System.out.println("Square area="+b.getarea(3.5));
		System.out.println("Square perimeter="+b.getperimeter(3.5));
		Circle q=new Circle();
	    System.out.println("Circle area="+q.getarea(3.5));
		System.out.println("Circle perimeter="+q.getperimeter(3.5));
	}
}

