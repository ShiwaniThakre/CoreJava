import java.util.*;

public class student {
public static void main(String args[])
{
	int m1,m2,m3,t;
	float p;
	m1=Integer.parseInt(args[0]);
	m2=Integer.parseInt(args[1]);
	m3=Integer.parseInt(args[2]);
	t=m1+m2+m3;
	p=(float)t/3;
	System.out.println("p="+p);
}
}
