import java.lang.annotation.*;
import java.lang.reflect.*;
@Retention (RetentionPolicy.RUNTIME)
@interface MyMark { }
class Marker
{
	@MyMark
	public static void myMethod()
	{
		Marker obj=new Marker();
		try
		{
			Method m=obj.getClass().getMethod("myMethod");
			if(m.isAnnotationPresent(MyMarker.class))
			System.out.println("MyMarker is present");
			else
			System.out.println("MyMarker is not present");
		}
		catch(NoSuchMethodException exc)
		{
			System.out.println("Method not found");
		}
	}
	public static void main(String args[])
	{
		myMethod();
	}
}
