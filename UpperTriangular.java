import java.util.*;
public class UpperTriangular {
 public static void main(String[]args)
 {
	 int [] [] a=new int[3][3];
	 int i,j;
    	Scanner obj=new Scanner(System.in);
		System.out.println("Enter the element of array:");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
	    {
		a[i][j]=obj.nextInt();
        }
        }
		System.out.println("Upper tringular Matrix:");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
	        {
				if(i<=j) 
				{
					System.out.print("\t"+a[i][j]);
				}
				else
				{
					System.out.print("\t"+0);
				}
				
            }
			  System.out.print("\n");
        }
		System.out.println("Lower tringular Matrix:");
		for(i=0;i<=2;i++)
		{
			for(j=0;j<=2;j++)
	        {
				if(i>=j) 
				{
					System.out.print("\t"+a[i][j]);
				}
				else
				{
					System.out.print("\t"+0);
				}
				
            }
			  System.out.print("\n");
        }
}
}