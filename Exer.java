class DemoVar {
int data=20;
static int a=12;
void method(){
int b=90;
System.out.println("Local variable value="+b);
}
public static void main(String a[])
{
DemoVar d=new DemoVar();
d.method();
System.out.println("instance variable value="+d.data);
System.out.println("Static variable value="+DemoVar.a);
}}