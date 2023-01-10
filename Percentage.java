package PracticeProgram;
import java.util.*;
public class Percentage {
public static void main(String args[])
{
	int p;
	@SuppressWarnings("resource")
	Scanner sc= new Scanner(System.in);
    System.out.println("enter no.");
    p=sc.nextInt();
    if(p>=60)
    	System.out.println("1st division");
    else
    	if(p>=40)
    		System.out.println("2nd division");
    	else
    		if(p>=35)
    			System.out.println("3rd division");
    		else
    			System.out.println("fail");

}
}
