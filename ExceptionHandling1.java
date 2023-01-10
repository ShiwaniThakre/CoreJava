
public class ExceptionHandling1 {
	public static void main(String[] args)
	 {
	 try
	 {
	  int arr[]={1,2};
	  arr[2]=3/1; // arr[2]=3/0.....o/p=divide by  zero
	 }
	  catch(ArithmeticException ae)
	  {
	   System.out.println("divide by zero");
	  }
	  catch(Exception e)
	  {
	   System.out.println("array index out of bound exception");
	  }
	 }
}
