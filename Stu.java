public class Stu{
String name;
int mo;
int age;
String address;
public String getDetails(){
return("name is:"+name+"Rno is:"+mo+"Age is:"+age+"Address is:"+address);
}
public static void main(String[] args){
Stu m=new Stu();
m.name="Sree";
m.mo=229;
m.age=20;
m.address="Hyd";
System.out.println(m.getDetails());
}
}