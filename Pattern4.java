import java.util.*;
public class Pattern4 {
   public static void main(String[]args)
   {
	   int n,a=0,b=1,x,y,sum;
	   Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
	   for(x=1;x<=n;x++)
	   {
		   for(y=1;y<x;y++)
		   { 
			 System.out.print(a+"\t");
		     sum=a+b;
		     a=b;
		     b=sum;
	       }
		   System.out.println();
	  }
   }
}
