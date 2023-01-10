import java.util.*;
public class SecondSmallest {

	public static void main(String []args)
    {
		Scanner obj = new Scanner(System.in);
        int n;
        System.out.println("Enter the size of the array");
        n=obj.nextInt();
        
        int a[]=new int[n]; 
       System.out.println("Enter the array");  
       for(int i=0;i<n;i++)   
       {
           a[i]=obj.nextInt();
       }
              
       for(int i=0;i<n;i++)  
       {
           for(int j=i+1;j<n;j++)    
           {
               if(a[i]<a[j])
               {
                   int temp=a[i];
                   a[i]=a[j];
                   a[j]=temp;
               }
           }
       }
       
       System.out.println("Second Largest element is "+a[1]);  
       System.out.println("Second Smallest element is "+a[n-2]); 
   }
}        





/*static void findLargest(int a[], int n)      //Method to find the second largest and second smallest element
{
  Arrays.sort(a); 
   System.out.println("Second Largest element is "+a[n-2]);  //Display Second Smallest
   System.out.println("Second Smallest element is "+a[1]);  //Display Second Largest
}
public static void main(String []args)
{
    Scanner obj=new Scanner(System.in);
    int n;
    System.out.println("Enter the size of the array");
    n=obj.nextInt();
    
    int a[]=new int[n]; 
   System.out.println("Enter the array");  
   for(int i=0;i<n;i++) 
   {
       a[i]=obj.nextInt();
   }
   findLargest(a,n);  //Function Call
   
}*/

		       
