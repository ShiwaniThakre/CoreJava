import java.util.*;
public class factorial {
public static void main(String[] args)
{
	int i=1, fact=1,n;
	Scanner obj=new Scanner(System.in);
	System.out.println("Enter n=");
	n=obj.nextInt();
	while(i<=n)
	{
		fact=fact*i;
		i++;
	}
	System.out.println("Factorial ="+fact);
}
}
