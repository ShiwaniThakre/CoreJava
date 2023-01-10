import java.util.*;
class info
{
	private
	
	int modelno, price;
	String cname;
	
	public
	void accept()
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter car model no=");
		modelno=obj.nextInt();
		
		System.out.println("Enter car name=");
		cname=obj.next();
		
		System.out.println("Enter car price=");
		price=obj.nextInt();
	}
	void display()
	{
		System.out.print("\n"+modelno);
		System.out.print("\t"+cname);
		System.out.print("\t"+price);
	}
}
public class Car_info {
 public static void main(String[]args) {
	 info[] c=new info[3];
	 int i;
	 for(i=0;i<=2;i++)
	 {
		 c[i]=new info();
	 }
	 for(i=0;i<=2;i++)
	 {
		 c[i].accept();
	 }
	 System.out.println("modelno\tcname \tprice");
	 for(i=0;i<=2;i++)
	 {
		 c[i].display();
	 }
 }
}
