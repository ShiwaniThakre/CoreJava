import java.util.*;
class rect
{
	private
	int len,bre,area;
	public
	void accept()
	{
		Scanner obj= new Scanner(System.in);
		System.out.println("enter length=");
		len=obj.nextInt();
		System.out.println("enter breadth=");
		bre=obj.nextInt();
	}
	void getarea()
	{
		area=len*bre;
		System.out.println("Area of rectangle="+area);
	}
}
public class Rectangle {
	public static void main(String[]args) {
	rect[] r=new rect	[5];
	int i;
	for(i=0;i<=4;i++)
	{
		r[i]=new rect();
	}
	for(i=0;i<=4;i++)
	{
		r[i].accept();
	}
	for(i=0;i<=4;i++)
	{
		r[i].getarea();
    }
  }
}
