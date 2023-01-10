import java.util.Scanner;
public class Attendance {
	public static void main(String[] args) {

	     Scanner in=new Scanner(System.in);
	     
	        System.out.println("Enter the number of classes held");
	        int n=in.nextInt();
	        System.out.println("Enter the number of classes attended");
	        int a=in.nextInt();
	        float per=(a*100)/n;
	        System.out.println("percentage : " +per);
	        if(per>75){
	            
	                   System.out.println("you can sit in exam");
	        }
	        else  
	        	       System.out.println("you can't sit in exam");
	        }          
	}

