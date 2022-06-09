class Student
{
  int rollno;
  String name;
  float fee;
  Student(int rollno,String name,float fee)
   {
     System.out.println(rollno+" "+name+" "+fee);
     this.rollno=rollno;
     this.name=name;
     this.fee=fee;
   }
   void display()
    {
      System.out.println(rollno+" "+name+" "+fee);
    }
}
class Name
{
  public static void main(String args[])
   {
     Student s1=new Student(111,"amit",50000);
     Student s2=new Student(112,"sai",40000);
     s1.display();
     s2.display();
   }
}