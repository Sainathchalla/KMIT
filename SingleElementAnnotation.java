class SingleElementAnnotation
{
	@interface Author
	{
		String value() default "Unknown";
     	String email() default "info@kmit.in";
    }
    @Author(value="Yash",email="yash@kmit.in")
    public static void main(String args[])
    {
    	printMsg("Welcome to single Element anno");
	}
	@Author(value="Sree")
	public static void printMsg(String msg)
	{
		printMsgUpper(msg);
	}
	@Author(value="Ram")
	public static void printMsgUpper(String msg)
	{
		System.out.println(msg.toUpperCase());
	}
}
