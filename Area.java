import java.util.*;
public class Area {
	public static void main(String[] args)
	{
		double pi=3.14, r, a;
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter Value Of r= ");
		r=obj.nextDouble();
		a=pi*r*r;
		System.out.println("Area Of Circle = "+a);
		
	}

}
