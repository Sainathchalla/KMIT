interface Move
{
	int speed=40;
	void move();
}
class Interface implements Move
{
	public void move()
	{
	    //speed=50;
		System.out.println("Speed="+speed);
	}
	public static void main(String args[])
	{
		Interface b=new Interface();
		b.move();
	}
}
