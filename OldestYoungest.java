import java.util.*;
public class OldestYoungest {
	public static void main(String args[])  {

	       int A,B,C,max,min;

	       Scanner sc=new Scanner(System.in);

	       System.out.print("Enter the age of First Person:  ");

	       A=sc.nextInt();

	       System.out.print("Enter the age of Second Person:  ");

	       B=sc.nextInt();

	       System.out.print("Enter the age of Third Person:   ");

	       C=sc.nextInt();

	       if(A>B && A>C)

	           System.out.println("First Person is the Oldest.");

	       else if(B>A && B>C)

	           System.out.println("Second Person is the Oldest.");

	       else if(C>A && C>B)

	           System.out.println("Third Person is the Oldest.");

	       else    {

	           System.out.println("All have equal ages.");

	           System.exit(0);

	       }

	       if(A<B && A<C)

	           System.out.println("First Person is the Youngest.");

	       else if(B<A && B<C)

	           System.out.println("Second Person is the Youngest.");

	       else if(C<A && C<B)

	           System.out.println("Third Person is the Youngest.");

	   }
}
