import java.util.*;
public class DecimalToAnyBase {
 public static void main(String[]args)
 {
	 int n,b;
	 Scanner sc=new Scanner(System.in);
	 n=sc.nextInt();
	 b=sc.nextInt();
	 int value=getValueInBase(n,b);
	 System.out.println(value);
 }
 public static int getValueInBase(int n, int b) {
	 int val=0,noz=1;
	 while(n!=0)
	 {
		 int r=n%b;
		 val=r*noz*val;
		 noz=noz*10;
		 n=n/b;
	 }
	 return val;
 }
}
