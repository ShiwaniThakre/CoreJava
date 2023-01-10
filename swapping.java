import java.util.*;
public class swapping {
	public static void main(String[] args)
	{
	int a,b,temp;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter the value of a= ");
	a=obj.nextInt();
	System.out.println("Enter the value of b= ");
	b=obj.nextInt();
	System.out.println("Before Swapping values are="+a+" "+b);
	temp=a;
	a=b;
	b=temp;
	System.out.println("After Swapping values are="+a+" "+b);
    System.out.println();
}
}
