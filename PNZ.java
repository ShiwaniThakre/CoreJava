package PracticeProgram;
import java.util.*;
public class PNZ {
public static void main(String args[])
{
	int n;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no.");
	n=sc.nextInt();
	if(n>0)
		System.out.println("n is +ve");
	else
		if(n<0)
		System.out.println("n is -ve");
	else
		System.out.println("n is zero");
	
}

}
