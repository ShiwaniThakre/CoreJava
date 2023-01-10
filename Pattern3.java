import java.util.*;
public class Pattern3 {
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  int n,i=1,x,y;
	  n=sc.nextInt();
	  for(x=1;x<=n;x++)
	  {
		  for(y=1;y<=x;y++)
		  {
			  System.out.print(i+"\t");
			  i++;
		  }
		  System.out.println();
	  }
  }
}
