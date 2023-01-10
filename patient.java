
class hospital
{
	protected
	String hname;
	int w_no;
	public
	hospital(String n,int w)
	{
	this.hname=n;
	this.w_no=w;
    }
}
public class patient extends hospital
{
   protected
   String pname;
   String pdisease;
   double pbill;
   
   public  patient(String n, int w,String p,String d,double b)
   {
	   super(n,w);
	   this.pname=p;
	   this.pdisease=d;
	   this.pbill=b;
   }
 
public void show()
   {
	   System.out.println("hospital name="+hname);
	   System.out.println("ward no="+w_no);
	   System.out.println("patient name="+pname);
	   System.out.println("disease name="+pdisease);
	   System.out.println("patient bill="+pbill);
	   System.out.println();
   }
	public static void main(String[]args)
	{
		patient p1=new patient("Jahangir Hospital",102,"Yash","Cancer",23948.56);
		p1.show();
		patient p2=new patient("Reliance Hospital",34,"John","Asthma",947484.96);
		p2.show();
	}
}