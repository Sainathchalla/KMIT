class Car
{
  private String color;
  private int maxspeed;
  public void carinfo()
  {
    System.out.println("Car Color="+color+"Max Speed="+maxspeed);
  }
  public void setColor(String color)
  {
    this.color=color;
  }
  public void setMaxSpeed(int maxSpeed)
  {
    this.maxspeed=maxspeed;
  }
}
public class FsM1HasA
{
  public static void main(String args[])
   {
     Maruthi m=new Maruthi();
     m.MaruthiStartDemo();
     m.setColor("Red");
     m.setMaxSpeed(120);
     m.carinfo();
   }
}
class Maruthi extends Car
{
  public void MaruthiStartDemo()
  {
    Engine MaruthiEngine=new Engine();
    MaruthiEngine.start();
  }
}
class Engine
{
  public void start()
  { System.out.println("Engine Started:"); }
  public void stop()
  { System.out.println("Engine Stopped:"); }
}
  
 