class Multitasking implements Runnable{
	static	int a=5,b=3;
	public static void Addition()
	{
		System.out.println(a+b);
	}
	public static void Sub()
	{
		System.out.println(a-b);
	}
	public static void Mul()
	{
		System.out.println(a*b);
	}

public void run(){
	System.out.println("Thread is running:");
	Addition();
	Sub();
	Mul();
}
public static void main(String args[])
{
	Multitasking m=new Multitasking();
	Thread t=new Thread(m);
	t.start();
	t.run();
}
	
}


