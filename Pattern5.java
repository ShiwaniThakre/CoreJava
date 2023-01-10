import java.util.*;
public class Pattern5 {
    public static void main(String[]args)
    {
    	int n,x,y = 0,i=1,j,f;
    	Scanner sc=new Scanner(System.in);
    	n=sc.nextInt();
    	
    	for(x=0;x<=n;x++)
    	{
    		for(j=2;j<=x;j++)
    		{
    			i=i*j;
    		}
    		for(j=0;j<=x;j++)
    		{
    			int fact1=1;
    			int fact2=1;
    			for(f=2;f<=y;f++)
    			{
    				fact1=fact1*f;
    			}
    			for(f=2;f<=x;f++)
    			{
    				fact2=fact2*f;
    			}
    			int prt= i/(fact1*fact2);
    			System.out.print(prt+"\t");
    		}
    		System.out.println();
    	}
    }
}
