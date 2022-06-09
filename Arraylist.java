import java.util.*;
class Arraylist
{
	public static void main(String args[])
	{
		ArrayList<Integer> arrlist=new ArrayList<Integer>();
		arrlist.add(14);
		arrlist.add(4);
		arrlist.add(3);
		arrlist.add(1);
		System.out.println("For loop");
		for(int counter=0;counter<arrlist.size();counter++)
		{
				System.out.println(arrlist.get(counter));
		}
		int count=0;
		System.out.println("While loop");
		while(arrlist.size()>count)
		{
		       System.out.println(arrlist.get(count));
		       count++;
	    }
	    System.out.println("Iterator");
	    Iterator iter=arrlist.iterator();
	    while(iter.hasNext())
	    System.out.println(iter.next());
	}
}
