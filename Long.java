import java.util.*;
public class Long {
	void find(long l,long b)
	 {
	 System.out.println("Area is: "+(l*b)) ;
	 }
	 void find(int l, int b,int h)
	 {
	 System.out.println("Area is: "+(l*b*h));
	 }
	 public static void main (String[] args)
	 {
	 Long ar = new Long();
	 ar.find(8,5); //automatic type conversion from find(int,int) to
	
	 ar.find(2,4,6); //find(int l, int b,int h) is called.
	 }
	
}
