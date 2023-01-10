import java.util.*;
public class Bonus {
	public static void main(String[] args) {
		 int year,sal;
		 double d;
		 System.out.println("Enter total Years of services=   ");
		 Scanner t=new Scanner(System.in);
		 year=t.nextInt();
		 
		 if(year>5)
		 {
			 System.out.println("Please Enter your salary..> ");
			 sal=t.nextInt();
			 System.out.println("YOUR SALARY IS= "+sal);
			 System.out.println("YOUR 5% BONUS  IS= "+sal*0.05);
			 System.out.println("YOUR NET BONUS WITH SALARY IS= "+(sal+(sal*0.05)));
		  }
		 
		 else
		 {
			 System.out.println("NO BONUS..");
		 }
	}
}
