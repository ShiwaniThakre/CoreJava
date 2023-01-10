import java.util.*;
public class PosNegZerOdEv {
	public static void main(String[]args)
	{
		int []a =new int[5];
		int cnt1=0,cnt2=0,cnt3=0,i,Even_Count = 0, Odd_Count = 0;
		System.out.println("enter array elements= ");
		Scanner obj=new Scanner(System.in);
		
		for(i=0;i<=4;i++)
		{
			a[i]=obj.nextInt();
		}
		for(i=0;i<=4;i++)
		{
			if(a[i]==0)
			cnt1++;
			if(a[i]>0)
			cnt2++;
			if(a[i]<0)
			cnt3++;
			if(a[i] % 2 == 0) 
			Even_Count++;
			if(a[i] % 2 != 0) 
			Odd_Count++;
		}
		 
		System.out.println("\n no of zero="+cnt1);
		System.out.println("\n no of positive="+cnt2);
		System.out.println("\n no of negative="+cnt3);
		System.out.println("\n  Even Number counts in this Array ="+Even_Count);
		System.out.println("\n Odd Number counts in this Array ="+Odd_Count);
		}
	}
