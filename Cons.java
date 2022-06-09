public class Cons
{
  private static final int Noofhrsinday=24;
  public static int calhrsindays(int days)
  {
     return days*Noofhrsinday;
  }
  public static int calhrsinweeks(int weeks)
  {
     final int Noofdayinweek=7;
     return weeks*Noofdayinweek*Noofhrsinday;
  }
  public static void main(String args[])
  {
     System.out.println("No of hrs in 2 days:"+calhrsindays(2));
     System.out.println("No of hrs in 3 weeks:"+calhrsinweeks(3));
  }
}