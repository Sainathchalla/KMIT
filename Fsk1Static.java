class Student
{
static int a;
static int b;
Student()
{
a=10;
}
public void showData()
{
System.out.println("non-static a="+a);
System.out.println("static b="+b);
}
public static void increment()
{
a++;
}
/*public static Student()
{
b=10;
}*/
static
{
b=100;
}
}
class Fsk1Static
{
public static void main(String[] args)
{
Student s1=new Student();
s1.showData();
Student s2=new Student();
s2.showData();
/*Student.b++;
s1.showData();
s1.b++;
s1.showData();*/
}
}