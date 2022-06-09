import java.util.*;
class TotMks extends Baseclass
{
    void marks()
    {
        
        for(int i = 0;i<2;i++){
            int sum = 0;
            for(int j =0;j<3;j++){
                sum += m[i][j];
            }
            m[i][3] = sum/3;
        }
    }
}
class GraceMks extends TotMks{
    final void grace()
    {
        for(int i = 0;i<2;i++){
            if(m[i][3] < 40)
            {
                m[i][4] = 1;
                m[i][3] += 5;
            }
        }
    }
}
class Baseclass{
    public int m[][] = new int[2][5];
    Scanner sc = new Scanner(System.in);
    Baseclass()
    {
        System.out.println("Enter the marks for 3 subjects:");
        for(int i =0;i<2;i++){
            for(int j=0;j<3;j++){
                int a = sc.nextInt();
                m[i][j] = a;
            }
        }
    }
}
class PL1 extends GraceMks
{
    public void display()
    {
        for(int i =0;i<2;i++){
            for(int j=0;j<5;j++){
                System.out.println(m[i][j]);
            }
        }
    }
    public static void main(String args[])
    {
        PL1 obj = new PL1();
        obj.marks();
        obj.grace();
        obj.display();
        
    }
}