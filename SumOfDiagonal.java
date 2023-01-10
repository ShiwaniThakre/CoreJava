import java.util.*;
public class SumOfDiagonal {
  public static void main(String[]args)
  {
	  int [][]a=new int[3][3];
	  int i,j,dsum=0,ndsum=0;
	  System.out.println("Enter Matrix A=");
	  Scanner obj=new Scanner(System.in);
	  for(i=0;i<3;i++)
	  {
		  for(j=0;j<3;j++)
		  {
			  a[i][j]=obj.nextInt();
		  }
	  }
	  for(i=0;i<3;i++)
	  {
		  for(j=0;j<3;j++)
		  {
			  if(i==j)
			  {
				  dsum=dsum+a[i][j];
			  }
			  else
			  {
				  ndsum=ndsum+a[i][j];
			  }
		  }
	  }
	  System.out.println("Sum of Diagonl element is="+dsum);
	  System.out.println("Sum of Non Diagonal element is"+ndsum);
  }
}
