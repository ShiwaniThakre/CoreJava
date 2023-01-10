import java.util.*;
public class ForEachLoopArray {
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
		for(int x:a)//for each loop
		{
			System.out.println(x);
		}
	}
}
