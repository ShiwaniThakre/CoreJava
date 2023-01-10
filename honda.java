import java.util.*;
class bike1
{
	final void run()
	{
		System.out.println("running");
	}
}
public class honda extends bike1{
	 void run()
	{
		System.out.println("running safely with 100km");
	}
   public static void  main(String[]args)
   {
	   honda obj=new honda();
	   obj.run();
   }
}
