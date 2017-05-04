package Labs;
import java.util.Scanner;
public class DNA_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String strand;
		int length, points = 0;
		double total_points = 0, mean = 0, standard_deviation = 0, deviation_sum = 0;
		char new_char;
		
		System.out.println("Enter the strand of DNA: ");
		strand = scan.nextLine();
		length = strand.length();
		
		char[] array_strand = new char[length];
		int[] array_score = new int[length];
		
		for (int i = 0; i < length; i ++)
		{
			char character = strand.charAt(i);
			switch (character)
			{
			case 'C':
				new_char = 'G';
				points = -1;
				array_strand[i] = new_char;
				array_score[i] = points;
				break;
			case 'G':
				new_char = 'C';
				points = -1;
				array_strand[i] = new_char;
				array_score[i] = points;
				break;
			case 'A':
				new_char = 'T';
				points = 1;
				array_strand[i] = new_char;
				array_score[i] = points;
				break;
			case 'T':
				new_char = 'A';
				points = 1;
				array_strand[i] = new_char;
				array_score[i] = points;
				break;	
			}
			// Finds the mean
			total_points = total_points + points;
			mean = total_points / length;
		// Finds the standard deviation
		}
		for (int i = 0; i < length; i ++)
		{
			deviation_sum += Math.pow((array_score[i] - mean), 2);
			standard_deviation = Math.sqrt((1.0/length)*deviation_sum);
		}
		System.out.println(array_strand);
		System.out.println("Mean: " + mean);
		System.out.println("Standard Deviation: " + standard_deviation);
	}
}
