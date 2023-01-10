class employee
{
	protected 
	int eid;
	String ename;
	public
	employee(int i,String n)
	{
		this.eid=i;
		this.ename=n;
	}
}
public class department extends employee
{	
  protected
  String dname;
  double salary;
  public
  department(int i, String n,String d, double s)
  {
	  super(i,n);
	  this.dname=d;
	  this.salary=s;
  }
  public void show()
  {
	  System.out.println("eid="+eid +"\nename="+ename +"\ndepartment name="+dname +"\nsalary="+salary);
  }
  public static void main(String[]args)
  {
	  department d1=new department(1,"john","computer",80000);
	  d1.show();
  }
}
                                                                                                                          
