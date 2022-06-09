import java.util.*;
public class Arraylistco
{
	public static void main(String args[])
	{
		ArrayList<String> obj=new ArrayList<String>();
		obj.add("Ajeet");
		obj.add("Harry");
		System.out.println("After add the list is:"+obj);
		obj.add(0,"Rahul");
		obj.add(1,"Justin");
		obj.remove("Chay");
		obj.remove("Harry");
		System.out.println("After add(index,obj) the remove is:"+obj);
		obj.remove(1);       //remove at index
		System.out.println("After remove(index) list is:"+obj);
		obj.set(1,"Radhika");     //replace
		System.out.println("After set(index,obj) update list is:"+obj);
	}
}
