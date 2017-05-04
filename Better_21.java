package Labs;
import java.util.Random;
public class Better_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		
		int card1, card2, card3, card4;
		int card1_value, card2_value, card3_value, card4_value;
		int card12_sum, card34_sum;
		
		card1 = generator.nextInt(13) + 2;
		card2 = generator.nextInt(13) + 2;
		card3 = generator.nextInt(13) + 2;
		card4 = generator.nextInt(13) + 2;
		
		System.out.println("Computer's Cards: " + card1 + " and " + card2);
		System.out.println("Our Cards: " + card3 + " and " + card4);
		
		// Card 1
		card1_value = card1;
		if (card1 == 11) // Jack
			card1_value = 10;
		if (card1 == 12) // Queen
			card1_value = 10;
		if (card1 == 13) // King
			card1_value = 10;
		if (card1 == 14) // Ace
			card1_value = 11;
	
		
		// Card 2
		card2_value = card2;
		if (card2 == 11) // Jack
			card2_value = 10;
		if (card2 == 12) // Queen
			card2_value = 10;
		if (card2 == 13) // King
			card2_value = 10;
		if (card2 == 14) // Ace
			card2_value = 11;
		
		
		// Card 3
		card3_value = card3;
		if (card3 == 11) // Jack
			card3_value = 10;
		if (card3 == 12) // Queen
			card3_value = 10;
		if (card3 == 13) // King
			card3_value = 10;
		if (card3 == 14) // Ace
			card3_value = 11;
		
		
		// Card 4
		card4_value = card4;
		if (card4 == 11) // Jack
			card4_value = 10;
		if (card4 == 12) // Queen
			card4_value = 10;
		if (card4 == 13) // King
			card4_value = 10;
		if (card4 == 14) // Ace
			card4_value = 11;
		
	
		// Finding the score of the cards
		if ((card1_value + card2_value) > 21)
			card12_sum = 0;
		else 
			card12_sum = card1_value + card2_value;
		if ((card3_value + card4_value) > 21)
			card34_sum = 0;
		else 
			card34_sum = card3_value + card4_value;
			
		System.out.println("Computers Score: " + card12_sum);
		System.out.println("Our Score: " + card34_sum);
		
		// Determine who wins
		if (card12_sum < card34_sum)
			System.out.println("We win");
		if (card12_sum > card34_sum)
			System.out.println("Computer wins");
		if (card12_sum == card34_sum)
			System.out.println("We tie");

	}

}
