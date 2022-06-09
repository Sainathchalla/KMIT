import java.util.*;
class Test
{
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    for(int i=n;i>=1;i--)
    {
        for(int j=1;j<i;j++)
        {
            System.out.print("  ");
        }
        for(int k=i;k<=n;k++)
        {
            System.out.print(k );   
        }
        System.out.println(" ");
    }
    
}
