package PracticeProgram;
import java.util.*;
public class VowelConsonent {
public static void main(String args[])
{
	char c;
	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);
	System.out.println("enter character");
	c=sc.next().charAt(0);
	if(c=='a'|| c=='e'|| c=='i'|| c=='o'|| c=='u')
		System.out.println("It is a vowel");
	else
		System.out.println("it a consonent");
}
}
