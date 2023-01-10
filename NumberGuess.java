import java.util.*;
	class NumberGuess {
		public static void Guessingnumbergame() {
			Scanner sc=new Scanner(System.in);
			int number=1+(int)(100*Math.random());
			int k=10;
			int i,guess;
			System.out.println("choose number between 1 to 100. Guess the number Within 10 trials.");
			for(i=0;i<k;i++)
			{
				System.out.println("Guess the number");
				guess=sc.nextInt();
				if(number==guess)
				{
					System.out.println("You Win!!!");
					break;
					}
				else if(number<guess&&i !=k-1) {
					System.out.println("The number is Too High"+guess);
				}
				else if(number>guess&&i !=k-1) {
					System.out.println("The number is Too Low"+guess);
				}
			}
			if(i==k) 
			{
			   System.out.println("you have exhausted K trials");
			   System.out.println("The number was"+number);
			}
		}
		public static void main(String arg[]) {
			Guessingnumbergame();
		}

	}