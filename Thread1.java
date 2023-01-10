class A extends Thread
{
	int i;
	public void run()
	{
		for(i=1;i<=5;i++)
		{
			System.out.println("i= "+i);
		}
	}
}
class B extends Thread
{
	int j;
	public void run()
	{
		for(j=1;j<=5;j++)
		{
			System.out.println("j= "+j);
		}
	}
}
class C extends Thread
{
	int k;
	public void run()
	{
		for(k=1;k<=5;k++)
		{
			System.out.println("k= "+k);
		}
	}
}
public class Thread1 {
	public static void main(String[]args)
	{
		A obj1=new A();
		obj1.start();
		B obj2=new B();
		obj2.start();
		C obj3=new C();
		obj3.start();
	}
}
