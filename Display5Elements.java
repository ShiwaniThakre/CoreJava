import java.util.*;
public class Display5Elements {
	public static void main(String args[])
	{
		int[] a=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Five Elements: ");
		for(i=0;i<=4;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("Accepted Elemnts are: ");
		for(i=0;i<=4;i++)
		{
			System.out.println("\t"+a[i]);
		}
	}
}
