import java.util.*;
public class Armstrong {
  public static void main(String[]args) {
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  int temp=n;
  int sum=0;
  while(temp!=0)
  {
	  int l=temp%10;
	  sum=sum+(int)Math.pow(l,3);
	  temp=temp/10;
	  }
	  if(sum==n)
	  {
	  System.out.println("Armstrong number");
	  }
	  else
	  {
	  System.out.println("Not an Armstrong Number");
	  }
}
}
