package PracticeProgram;
import java.util.*;
public class Age {
	public static void main(String args[])
	{
	int age;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.print("enter no.");
	age=sc.nextInt();
	if(age>=1 && age<=5)
		System.out.println("Group A");
	else
		if(age>=6 && age<=10)
			System.out.println("Group b");
		else
			if(age>=11 && age<=15)
				System.out.println("Group c");
			else
				System.out.println("not eligible");
}
}
