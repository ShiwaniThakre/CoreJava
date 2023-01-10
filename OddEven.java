package PracticeProgram;
import java.util.*;
public class OddEven {
@SuppressWarnings("resource")
public static void main(String args[])
{
	int n;
	 Scanner sc= new Scanner(System.in);
	System.out.print("enter no.");
	n=sc.nextInt();
	if(n%2==0)
		System.out.println("n is even");
	else
		System.out.println("n is odd");
}
}
