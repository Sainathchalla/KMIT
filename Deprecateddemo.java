class Depre
{
	@Deprecated
	int num=10;
	final int maxnum=20;
	@Deprecated
	public void mysql()
	{
		System.out.println("This maethod is marked as deprecated");
	}
}
class Deprecateddemo
{
    @SuppressWarnings({"unchecked","deprecation"})
	public static void main(String args[])
	{
		Depre obj=new Depre();
		obj.mysql();
		System.out.println(obj.num);
	}
}
