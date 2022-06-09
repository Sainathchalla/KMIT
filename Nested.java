class CPU
{
  double price;
  class Processor
   {
     double cores;
     String manufacturer="Intel";
     double getCache()
      {
        return 4.3;
      }
   }
   protected class Ram
   {
      double memory;
      String manufacturer="IBM";
      double getClockSpeed()
      {
        return 5.5;
      }
   }
}
public class Nested
{
  public static void main(String args[])
   {
     CPU cpu=new CPU();
     CPU.Processor processor=cpu.new Processor();
     CPU.Ram ram=cpu.new Ram();
     System.out.println("Processor"+processor.manufacturer+"cache="+processor.getCache());
     System.out.println("Ram"+ram.manufacturer+"speed="+ram.getClockSpeed());
   }
}
     
  