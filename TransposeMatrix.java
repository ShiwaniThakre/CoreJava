import java.util.*;
public class TransposeMatrix {
	public static void main(String[]args)
	{
		int [][] a=new int[3][3];
		int [][] b=new int[3][3];
		int i,j;
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
				b[j][i]=a[i][j];
			}
		}
		System.out.println("Transpose Matrix=");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print("\t"+b[i][j]);
			}
			System.out.println("");
		}
	}
}
