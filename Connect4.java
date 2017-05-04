package Homework;
import java.util.Scanner;
public class Connect4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int player1_choice = 0, player2_choice = 0, SENTINEL = -1;
		char[] board = new char[42];
		for (int i = 0; i < board.length; i ++)
		{
			board[i] = 'O';
		}
		for (int i = 0; i < 6; i ++)
		{
			
			for (int j = 0; j < 7; j ++)
			{
				System.out.print(board[7*i + j]);
			}
			System.out.println();
		}
		do
		{
			Scanner scan = new Scanner(System.in);
			// Player 1
			System.out.println("Player 1 input an integer: ");
			player1_choice = scan.nextInt();
			if (player1_choice != SENTINEL)
			{
				board[player1_choice] = '1';
				for (int i = 0; i < 6; i ++)
				{
					
					for (int j = 0; j < 7; j ++)
					{
						System.out.print(board[7*i + j]);
					}
					System.out.println();
				}
			}
			
			// Player 2
			System.out.println("Player 2 input an integer: ");
			player2_choice = scan.nextInt();
			if (player2_choice != SENTINEL)
			{
				board[player2_choice] = '2';
				for (int i = 0; i < 6; i ++)
				{
					
					for (int j = 0; j < 7; j ++)
					{
						System.out.print(board[7*i + j]);
					}
					System.out.println();
				}	
			}
		}while (player1_choice != SENTINEL && player2_choice != SENTINEL);
	}

}
