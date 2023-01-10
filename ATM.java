import java.util.*;
public class ATM {
	public static void main(String args[] )  
    {   
        int balance = 10000, withdraw, deposit;  
        Scanner obj = new Scanner(System.in); 
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("1 to Withdraw");  
            System.out.println("2 to Deposit");  
            System.out.println("3 to Check Balance");  
            System.out.println("4 to  EXIT");  
            System.out.print("Choose the option to continue:");  
          
            int choice = obj.nextInt();  
            switch(choice)  
            {  
                case 1:  
                    System.out.print("Enter money to be withdrawn:");    
                     withdraw =obj.nextInt();  
          
            if(balance >= withdraw)  
            {  
              balance = balance - withdraw;  
              System.out.println("Please collect your money");  
            }  
            else  
            {  
           
            System.out.println("Insufficient Balance");  
            }  
            break;  
   
            case 2:               
        System.out.print("Enter money to be deposited:"); 
        deposit = obj.nextInt(); 
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        break;  
   
            case 3:  
        System.out.println("Balance : "+balance);    
        break;  
   
            case 4:  
        System.exit(0);  
            }  
        }  
    }  
}  
