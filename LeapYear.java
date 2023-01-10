package PracticeProgram;
import java.util.*;
public class LeapYear {
public static void main(String args[])
{
	int y;
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
	System.out.print("enter year");
	y=sc.nextInt();
	if(y%4==0 && 100!=0)
			System.out.println("it is Leap Year");
	else
		System.out.println("it is not a leap year");
}
}
