package Homework;
/* Write a program that plays the Hi-Lo guessing game with numbers. The 
 * program should pick a random number between 1 and 100 (inclusive), then 
 * repeatedly prompt the user to guess the number. On each guess, report to 
 * the user that he or she is correct or that the guess is high or low. 
 * Continue accepting guesses until the user guesses correctly or chooses to 
 * quit. Use a sentinel value to determine whether the user wants to quit. 
 * Count the number of guesses and report that value when the user guesses 
 * correctly. At the end of each game (by quitting or a correct guess), prompt
 * to determine whether the user wants to play again. Continue playing games 
 * until the user chooses to stop. */
import java.util.Scanner;
import java.util.Random;
public class PP_5_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		int rand_num, guess=0, num_guesses=0, SENTINEL=0;
		rand_num = generator.nextInt(100) + 1;
		
		System.out.println("Enter a guess or enter 0 to quit."); // Prompts the user to play
		guess = scan.nextInt();
		if (guess != SENTINEL)
			num_guesses ++;
		
		while (guess != SENTINEL) // If user chooses to play
		{
			if (guess > rand_num)
			{
				System.out.println("Your guess is too high");
				System.out.println("Enter a guess or enter 0 to quit: ");
				guess = scan.nextInt();
				if (guess != SENTINEL)
					num_guesses ++;
			}
			if (guess < rand_num)
			{
				System.out.println("Your guess is too low");
				System.out.println("Enter a guess or enter 0 to quit: ");
				guess = scan.nextInt();
				if (guess != SENTINEL)
					num_guesses ++;
			}
			if (guess == rand_num)
			{
				System.out.println("You guessed correctly!");
				System.out.println("It took " + num_guesses + " guesses.");
				rand_num = generator.nextInt(100) + 1;
				num_guesses = 0;
				System.out.println("Enter a new guess to play again or enter 0 to quit: ");
				guess = scan.nextInt();
				if (guess != SENTINEL)
					num_guesses ++;
			}
			if (guess == SENTINEL)
			{
				System.out.println("Thank you for playing.");
				rand_num = generator.nextInt(100) + 1;
				num_guesses = 0;
				System.out.println("Enter a new guess to play again or enter 0 to quit: ");
				guess = scan.nextInt();
				if (guess != SENTINEL)
					num_guesses ++;
			}
			
		}
		
	}

}
