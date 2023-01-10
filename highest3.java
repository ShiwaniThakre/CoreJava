package PracticeProgram;


import java.util.*;
public class highest3 {
	public static void main(String args[])
{
	int a,b,c;
	
	Scanner Sc =new Scanner(System.in);
	System.out.print("Enter 3 Nos ");
	a=Sc.nextInt();
	b=Sc.nextInt();
	c=Sc.nextInt();
	if(a>b)
	 if(a>c)
		System.out.println("a is highest");
	 else
		System.out.println("c is highest");
	else
		if(b>c)
			System.out.println("b is highest");
		else
			System.out.println("c is highest");
	
}

}
