import java.util.*;

public class Students {
	private
	int rollno;
	String name;
	double marks;
	
	Students()
	{
	 rollno=1;
	 name="spark";
	 marks=78;
   }
	Students (int r,String n,double m) 
	{
		rollno=r;
		name=n;
		marks=m;
	}
	void display()
	{
		System.out.println("roll no="+rollno);
		System.out.println("name="+name);
		System.out.println("marks="+marks);
	}

public static void main(String[] args)
{
	Students s=new Students();
	s.display();
	Students s1=new Students(2,"pooja",76);
	s1.display();
}	
}
	


