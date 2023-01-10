import java.util.*;
public class LargestSmallest {
 private static Scanner obj;

public static void main(String[]args)
 {
	 int [] a=new int[5];
	 int s,l,i;
	 obj = new Scanner(System.in);
	 System.out.println("Enter Elelments in array=");
	 for(i=0;i<5;i++)
	 {
		a[i]=obj.nextInt();
	 }
		 l=a[0];
		  for(i=0;i<5;i++)
		  {
		    if(a[i]>l)
		  {
		   l=a[i];
		  }
		}
		  s=a[0];
		  for(i=0;i<5;i++)
		 {
		  if(a[i]<s)
		 {
		   s=a[i];
		 }
		}
		 System.out.println("Largest element is= "+l);
		 System.out.println("Smallest element is= "+s);
 }
}
