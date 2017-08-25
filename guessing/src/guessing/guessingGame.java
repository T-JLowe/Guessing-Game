package guessing;
import java.util.Scanner;

public class guessingGame 
{
	
	public static void main(String[] args) 
	{
		boolean i = true;
		while (i = true)//This loop allows the game to continue endlessly at the users choice
		{
			System.out.println("Welcome to the guessing game! Enter an upper limit for my guess");
			Scanner cin = new Scanner(System.in); //Opening a scanner, this is used numerous times
			int max = cin.nextInt(); //Taking the users input as an integer
			
			int random = (int)(1 + max*Math.random()); //Generating a random number between 1 and whatever the user wants
			System.out.println("Im thinking of a number between 1 and " + max + ". Enter a guess"); //Telling the user what they choose
			
			boolean n = true;
			while (n = true) //This loop handles telling the user if they are too high/low
			{	
				int guess = cin.nextInt();
				if(guess>random)
				{
					System.out.println("Too high");
				}
				else if(guess<random)
				{
					System.out.println("Too low");
				}
				else
				{
					System.out.println("You got it right! Would you like to play again? Enter Yes or No.");
					
					String answer = cin.next();//Taking in input as a string
	
					if(answer.equals("yes"))//Seeing if their answer is yes
					{
						break; //Sends the user back to the first loop
					}
					else
					{
						System.out.println("Thanks for Playing!"); //Friendly computer
						System.exit(0);//Terminates the program
					}
				}
			}	
		}
	}
}