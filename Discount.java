import java.util.*;
public class Discount {
	public static void main(String[]args)
	{
	int quantity = 0;
	
	Scanner obj=new Scanner(System.in);
    System.out.println("Enter quantity");
    quantity=obj.nextInt();

    if(quantity*100 > 1000){
        double cost  = (quantity*100)-(0.1*(quantity*100));
        System.out.println("Your cost is="+cost);
    }
    else{
        System.out.println("Your cost is="+quantity*100);
    }
}
}
