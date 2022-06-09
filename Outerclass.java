public class Outerclass
{ //create outerclass
  private int data=30;//instance variable
  void outermethod() //instance method of outerclass
   {
     class Localclass  //class defined inside method of outer class
      { //define local method method in local class
        void localmethod()
          { 
            System.out.println(data);
          }
      }
        Localclass localobj=new Localclass();
        localobj.localmethod();
   }
  public static void main(String args[])
   {
      Outerclass obj=new Outerclass();
      obj.outermethod();
   }
}