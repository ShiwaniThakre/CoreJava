import java.util.*;
public class JavaPrgrm1 {
	 public static void main(String args[])
	 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a number");
	 int n=sc.nextInt();
	 int sum=0;
	 while(n!=0)
	 {
	 int l=n%10;
	 sum=sum+l;
	 n=n/10;
	 }
	 System.out.println("Sum of Digits : "+sum);
	 }
	}

