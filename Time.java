class seconds
{
  
  int sec=4;



}
class minutes extends seconds
{


  int min=5;

}
class hours extends minutes
{

 int hr=6;

}
class Time extends hours
{
   public static void main(String args[])
    {
       Time obj=new Time();
       obj.dispTime();
    }
   public void dispTime()
   {
      System.out.println(+hr+":"+min+":"+sec);
      int hrs=hr*60*60;
      int mins=min*60;
      int res=hrs+mins+sec;
      System.out.println(+res);
   }

}