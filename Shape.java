abstract class Shape
{
	abstract void getarea(double length);
	abstract void getperimeter(double length);
}
class Circle extends Shape
{
   	void getarea(double length)
	{
		double area1=3.14*length*length;
		//return area1;
		System.out.println(area1);
	}
	void getperimeter(double length)
	{
		double per1=2*3.14*length;
		//return per1;
		System.out.println(per1);
	}
}
class Square extends Shape
{
   	void getarea(double length)
	{
		double area2=length*length;
		//return area2;
		System.out.println(area2);
	}
	void getperimeter(double length)
	{
		double per2=4*length;
		//return per2;
		System.out.println(per2);
	}
	public static void main(String args[])
	{
		Square b=new Square();
		b.getarea(2.2);
		b.getperimeter(2.2);
	}
}

