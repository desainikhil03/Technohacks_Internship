import java.util.Random;
import java.util.Scanner;
public class NumberGuessingGame {
	public static void main(String args[]) {
		
		Random rand = new Random();
		
		int randomNumber = rand.nextInt(100)+1;
		//System.out.println("Random number is "+ randomNumber);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100. Try to guess it.");
		
		int tryCount = 0;
		while(true) {
			System.out.println("Enter your guess(1-100): "); 
			
			Scanner scanner = new Scanner(System.in);
			int playerGuess = scanner.nextInt();
			tryCount++;
			
			if(playerGuess == randomNumber) {
				System.out.println("Correct ! You Win! ");
				System.out.println("It took you "+ tryCount + "tries");
				break;
			}
			else if(randomNumber>playerGuess) {
				System.out.println("Nop! The number is higher . Guess Again");
			}
			else {
				System.out.println("Nop! The number is lower . Guess Again");
			}
		}		
		
	}
}
