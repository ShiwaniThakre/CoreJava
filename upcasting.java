class Bank
{
	public
	float getRateOfInterest()
	{
		return 0;
	}
}
class SBI extends Bank
{
	public 
	float getRateOfInterest()
	{
		return 8.4f;
	}
}
class ICICI extends Bank
{
	public
	float getRateOfInterest()
	{
		return 7.3f;
	}
}
class AXIS extends Bank
{
	public
	float getRateOfInterest()
	{
		return 9.7f;
	}
}
public class upcasting {
  public static void main(String[]args)
  {
	  Bank b;
	  b=new SBI();
	  System.out.println("SBI rat of interest is="+b.getRateOfInterest());
	  b=new ICICI();
	  System.out.println("ICICI rat of interest is="+b.getRateOfInterest());
	  b=new AXIS();
	  System.out.println("AXIS rat of interest is="+b.getRateOfInterest());
  }
}
