package Labs;
import java.util.Scanner;
import java.util.Random;
public class RPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		int choice = 0, comp_choice, SENTINEL = 0;
		int your_score = 0, comp_score = 0;
		comp_choice = generator.nextInt(3) + 1;
		
		System.out.println("Enter 1 for Rock, 2 for Paper, 3 for " +
		" Scissors, or 0 to quit: ");
		choice = scan.nextInt();
		
		while(choice != SENTINEL)
		{
			// Prints out your and the computers choices
			if (choice == 1)
				System.out.println("You: Rock");
			if (choice == 2)
				System.out.println("You: Paper");
			if (choice == 3)
				System.out.println("You: Scissors");
			if (comp_choice == 1)
				System.out.println("Computer: Rock");
			if (comp_choice == 2)
				System.out.println("Computer: Paper");
			if (comp_choice == 3)
				System.out.println("Computer: Scissors");
			// Decides who won
			if (choice == 1)
			{
				if (comp_choice == 1)
					System.out.println("You tie.");
				if (comp_choice == 2)
				{
					System.out.println("Computer wins.");
					comp_score ++;
				}
				if (comp_choice == 3)
				{
					System.out.println("You win.");
					your_score ++;
				}
			
			}
			if (choice == 2)
			{
				if (comp_choice == 1)
				{
					System.out.println("You win.");
					your_score ++;
				}
				if (comp_choice == 2)
					System.out.println("You tie.");
				if (comp_choice == 3)
				{
					System.out.println("Computer wins.");
					comp_score ++;
				}
				
			}
			if (choice == 3)
			{
				if (comp_choice == 1)
				{
					System.out.println("Computer wins.");
					comp_score ++;
				}
				if (comp_choice == 2)
				{
					System.out.println("You win.");
					your_score ++;
				}
				if (comp_choice == 3)
					System.out.println("You tie.");
				
			}
			System.out.println("Your score: " + your_score);
			System.out.println("Computers score: " + comp_score);
			
			System.out.println("Enter 1 for Rock, 2 for Paper, 3 for " +
					" Scissors, or 0 to quit: ");
					choice = scan.nextInt();
			comp_choice = generator.nextInt(3) + 1;
			
		}
		
		if (choice == SENTINEL)
			System.out.println("Thank you for playing!");
		
	}

}
