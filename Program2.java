import java.util.*;
class Student
{
    int id;
    String name;
    int score;
    Student()
    { 
      System.out.println("Enter student name:");
      Scanner a=new Scanner(System.in);
      int id=a.nextInt();
      Scanner b=new Scanner(System.in);
      String name=b.nextLine();
      Scanner c=new Scanner(System.in);
      int score=c.nextInt();
    }  
}
public class Program2
{
    public static void main(String args[])
    {
        Student obj=new Student();
        System.out.println("Student Details:");
        System.out.println("Id :"+obj.id);
        System.out.println("Name :"+obj.name);
        System.out.println("Score :"+obj.score);
    }
}
