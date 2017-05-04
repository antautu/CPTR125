package Homework;

public class While_Loop_Wkst_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tree_size = 21; // Number of 0 in bottom row
		int num_zeroes = 1; // 1 to start
		int white_space = tree_size / 2; 
		int line = 0; // Starts at first line
		
		while (num_zeroes <= tree_size)
		{
			while (line < white_space)
			{
				System.out.print(" "); // Just print so all spaces are on same line
				line ++;
			}
			
			line = 0; // Need to reset
			
			while (line < num_zeroes)
			{
				System.out.print(0);
				line ++;
			}
			
			line = 0; // Need to reset again
		 	white_space --; // Decreases by 1 for each line
		 	num_zeroes = num_zeroes +2; // Increases by 2 for each line
		 	System.out.println(); 
		}
		
	}

}
