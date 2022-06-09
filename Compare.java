import javax.swing.JOptionPane;
public class Compare
{
  public static void main(String args[])
   {
     String aName="Mahesh";
     //String anotherName;
//="Mahesh";
    String anotherName=JOptionPane.showInputDialog(null,"Enter your name");
    if(aName==anotherName)
    System.out.println(aName+"equals"+anotherName);
    else
    System.out.println(aName+"does not equal"+anotherName);
    System.exit(0);
   }
}