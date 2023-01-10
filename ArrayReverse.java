import java.util.*;
public class ArrayReverse {
	public static void main(String[]args)
	{
		int[] a=new int[5];
		int i;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Five Elements: ");
		for(i=0;i<=4;i++)
			//for(i=0;i<a.lenght;i++)
		{
			a[i]=obj.nextInt();
		}
		Arrays.sort(a);
		System.out.println("Accepted Elemnts are: ");
		for(i=4;i>=0;i--)
			//for(i=4;i>a.lenght;i--)
		{
			System.out.println("\t"+a[i]);
		}
	}
}
