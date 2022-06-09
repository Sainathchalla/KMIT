import java.util.*;
class Arraylist2
{
	public static void main(String args[])
	{
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(4);
		arrlist.add(3);
		arrlist.add(1);
		arrlist.add(1);
		int flag=0;
		for(int counter1=0;counter1<arrlist.size();counter1++)
		{
			for(int counter2=counter1+1;counter2<arrlist.size();counter2++)
			   {
			   	  if(arrlist.get(counter1)==arrlist.get(counter2))
			   	  {
			   	  	flag=1;
				  }
			   }
		}
		if(flag==1)
		{
			System.out.println("Not unique");
		}
		else
		{
			System.out.println("Unique");
		}
	}
}
