
public class StaticMethod {
public static void square(int x)
{
	System.out.println(x*x);
}
public  static void main(String[]args)
{
	square(8);//static method square() is called without any class
}

}
