
import java.util.*;
public class highest {
@SuppressWarnings("resource")
public static void main(String args[])
{
	int a,b;
	Scanner sc;
	sc = new Scanner(System.in);
	System.out.print("enter two no.s");
	a=sc.nextInt();
	b=sc.nextInt();
	if(a>b)
		System.out.println("a is highest");
	else
		if(a<b)
			System.out.println("b is highest");
		else
			System.out.println("both are same");
}
}
