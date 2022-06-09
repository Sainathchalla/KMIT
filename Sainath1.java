class SainathStatic
{
String s="abc";
static int n;
public SainathStatic()
{
System.out.println("constructor called. s="+s+"n="+n);
}
static {
n=10;
System.out.println("static initializer called.n="+n);
}
{
n=1000;
s="def";
System.out.println("instance initializer called s="+s+"n="+n);
}
public static void main(String[] args)
{
n=100;
System.out.println("main called.n="+n);
SainathStatic obj=new SainathStatic();
}
}
