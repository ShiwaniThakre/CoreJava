import java.util.*;

class Information
{
 		public
 		int found=0;
  			int max,eid,key,esalary,i;
			String ename,designation;
			
		public
			void accept()
			{
			 Scanner obj=new Scanner(System.in);
			 System.out.println("Enter Employee ID:");
			 eid=obj.nextInt();
			 System.out.println("Enter Employee Name:");
			 ename=obj.next();
			 System.out.println("Enter Employee Salary:");
			 esalary=obj.nextInt();
			 System.out.println("Enter Employee Designation:");
			 designation=obj.next();
			}
			void display()
			{
				 System.out.print("\n"+eid);
				 System.out.print("\t"+ename);
				 System.out.print("\t"+esalary);
				 System.out.print("\t"+designation);			
			}
			int search(int id)
			{
		
				if(eid==id)
				{
					System.out.print("emp id="+eid);
					System.out.print("\t name="+ename);
					System.out.print("\t salary="+esalary);
			       found=1;
				}
				if(found==1)
				{
				 System.out.print("\n record found");
				}
				else
				{
				 System.out.print("\n record not found");
				}
				return 0;
				}
}
public class Details {
	public static void main(String[]args)
{
		Information[] e=new Information[10];
	int i,n=0,choice,id,max;
	   Scanner obj=new Scanner(System.in);
		System.out.println("Enter Number Of Records:");
		n=obj.nextInt();
		for(i=0;i<3;i++)
		 {
		  e[i]=new Information();
		 }
			for(i=0;i<n;i++)
			{
				e[i].accept();
			}
	do
	{
		System.out.println("\n---Enter Your Choice---");
	
		System.out.println("Press 1 To Display all the Employee Records.");
		System.out.println("Press 2 To Search records by using Employee ID.");
		System.out.println("Press 3 To Show Maximum Salary details.");
		System.out.println("Press 4 To Exit.\n");
		choice=obj.nextInt();
	switch(choice)
	{ 
		case 1:
			System.out.println("\nEmployee Details:\n");
			System.out.println("\nId\tName\tSalary\tRole");
			
			for(i=0;i<n;i++)
			{
				e[i].display();	
			}
			break;
		case 2:
			System.out.println("Enter Id to search:");
			id=obj.nextInt();
			for(i=0;i<n;i++)
			{
			
			e[i].search(id);
		}
		
		break;
		case 3:
			 max=e[0].esalary;
			for(i=0;i<n;i++)
			{
				if(max<e[i].esalary)
					max=e[i].esalary;
			}
			System.out.println("\nMaximum Salary="+max);
			break;
		//	case 4:
		
			//exit(0);
			//break;
		//default:
		//	cout<<"Invalid Input.";
	}
}while(choice!=4);
}}

