package Labs;

import java.util.Random;
import java.util.Scanner;

public class RPS_Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		int choice = 0, comp_choice, SENTINEL = 0;
		int your_score = 0, comp_score = 0, CASE = 0;
		comp_choice = generator.nextInt(3) + 1;
		
		System.out.println("Enter 1 for Rock, 2 for Paper, 3 for " +
		" Scissors, or 0 to quit: ");
		choice = scan.nextInt();
		
		CASE = choice*10 + comp_choice;
		
		
		while(choice != SENTINEL)
		{
			switch(CASE)
			{
				case 11:
					System.out.println("You: Rock");
					System.out.println("Computer: Rock");
					System.out.println("You tie.");
					break;
				case 12:
					System.out.println("You: Rock");
					System.out.println("Computer: Paper");
					System.out.println("Computer wins.");
					comp_score++;
					break;
				case 13:
					System.out.println("You: Rock");
					System.out.println("Computer: Scissors");
					System.out.println("You win.");
					your_score++;
					break;
					
				case 21:
					System.out.println("You: Paper");
					System.out.println("Computer: Rock");
					System.out.println("You win.");
					your_score++;
					break;
				case 22:
					System.out.println("You: Paper");
					System.out.println("Computer: Paper");
					System.out.println("You tie.");
					break;
				case 23:
					System.out.println("You: Paper");
					System.out.println("Computer: Scissors");
					System.out.println("Computer wins.");
					comp_score++;
					break;
					
				case 31:
					System.out.println("You: Scissors");
					System.out.println("Computer: Rock");
					System.out.println("Computer wins.");
					comp_score++;
					break;
				case 32:
					System.out.println("You: Scissors");
					System.out.println("Computer: Paper");
					System.out.println("You win.");
					your_score++;
					break;
				case 33: 
					System.out.println("You: Scissors");
					System.out.println("Computer: Scissors");
					System.out.println("You tie.");
					break;
				
			}
			System.out.println("Your score: " + your_score);
			System.out.println("Computers score: " + comp_score);
			
			System.out.println("Enter 1 for Rock, 2 for Paper, 3 for " +
					" Scissors, or 0 to quit: ");
					choice = scan.nextInt();
			comp_choice = generator.nextInt(3) + 1;
			
			CASE = choice*10 + comp_choice;
			
		}
		
		if (choice == SENTINEL)
			System.out.println("Thank you for playing!");
		

	}

}
