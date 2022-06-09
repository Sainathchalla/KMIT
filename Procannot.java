import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Method;

@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@interface JavaFileInfo
{
	String author() default "unknown";
	String version() default "0.0";
}
@JavaFileInfo
class DemoClass
{
	@JavaFileInfo(author="Loki",version="2.0")
	public String getString()
	{
		return null;
	}
}
public class Procannot
{
	public static void main(String args[])throws NoSuchMethodException,SecurityException
	{
		new DemoClass();
		Class<DemoClass> demoClassObj=DemoClass.class;
		readAnnotationOn(demoClassObj);
		Method method =demoClassObj.getMethod("getString",new Class[]{});
		readAnnotationOn(method);
	}
	static void readAnnotationOn(AnnotatedElement element)
	{
		try
		{
			System.out.println("\n Finding annotation on"+element.getClass().getName());
			Annotation[] annotations=element.getAnnotations();
			for(Annotation annotation : annotations)
			{
				if(annotation instanceof JavaFileInfo)
				{
					JavaFileInfo fileinfo=(JavaFileInfo) annotation;
					System.out.println("Author:"+fileinfo.author());
					System.out.println("Version:"+fileinfo.version());
				}
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
