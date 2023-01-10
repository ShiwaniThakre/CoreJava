
public class ExceptionHandling {
	public static void main(String[]args)
	{
		int a=10,b=0;
		try
		{
			int c=a/b;
			System.out.println(c);
			System.out.println("This line will not be executed");
		}
		catch(Exception e)
		{
			System.out.println("divide by zero");
		}
		System.out.println("After exception is handled");
	}

}
