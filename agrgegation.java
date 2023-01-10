class author
{
	String authorname;
	int age;
	String place;
	public
	author(String n,int a,String p)
	{
		this.authorname=n;
		this.age=a;
		this.place=p;
	}
	public String getAuthorname()
	{
		return authorname;
	}
	public int getage()
	{
		return age;
	}
	public String getplace()
	{
		return place;
	}
}
class book
{
	String bname;
	int price;
	author at;
	public
	book(String b,int p,author auth)
	{
		this.bname=b;
		this.price=p;
		this.at=auth;
	}
	public void showDetails()
	{
		System.out.println("book name is="+bname);
		System.out.println("book price is="+price);
		System.out.println("Author name is="+at.getAuthorname());
		System.out.println("Author Age is="+at.getage());
		System.out.println("Author place is="+at.getplace());
	}
}
public class agrgegation 
{
	 public static void main(String args[])
	 {
	 author auth=new author("Me",22,"India");
	 book b=new book("Java",550,auth);
	 b.showDetails();
	 }
}
