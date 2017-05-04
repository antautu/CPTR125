package Homework;
/* Design and implement an application that simulates a simple slot machine
 * in which three numbers between 0 and 9 are randomly selected and printed 
 * side by side. Print an appropriate statement if all three of the numbers
 * are the same, or if any two of the numbers are the same. Continue playing
 * until the user chooses to stop. */
import java.util.Scanner;
import java.util.Random;
public class PP_5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		int num1, num2, num3, SENTINEL=0;
		
		System.out.println("Enter 1 to play or 0 to quit."); // Prompts the user to play
		SENTINEL = scan.nextInt();
		
		while (SENTINEL != 0)
		{
			num1 = generator.nextInt(10); // Creates random numbers
			num2 = generator.nextInt(10);
			num3 = generator.nextInt(10);
			
			System.out.println(num1 + " " + num2 + " " + num3);
			if (num1 == num2) // Decides if the numbers are the same
			{
				if (num1 == num3)
					System.out.println("All 3 numbers are the same.");
				else
					System.out.println("2 numbers are the same.");
			}
			if (num1 == num3)
			{
				if (num1 == num2)
					System.out.println("All 3 numbers are the same.");
				else
					System.out.println("2 numebrs are the same");
			}
			if (num2 == num3)
			{
				if (num2 == num1)
					System.out.println("All 3 numbers are the same.");
				else 
					System.out.println("2 numbers are the same.");
			}
			System.out.println("Enter 1 to play or 0 to quit."); // Prompts the user to play
			SENTINEL = scan.nextInt();
			
			if (SENTINEL == 0)
				System.out.println("Thank you for playing."); // Prints if the user quits
		}
		
	}

}
