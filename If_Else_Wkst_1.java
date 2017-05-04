package Homework;
import java.util.Scanner; 
import java.util.Random;
public class If_Else_Wkst_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random generator = new Random();
		
		
		double temp;
		int numx, numy;
		String x="", y=""; // Need to initialize with double quotes 
		
		numx = generator.nextInt(3);
		numy = generator.nextInt(3);
		
		//System.out.println(numx);
		//System.out.println(numy);
		
		if (numx == 0)
			x = "a jacket";
		if (numx == 1)
			x = "a scarf";
		if (numx == 2)
			x = "a hat";
		
		if (numy == 0)
			y = "shorts";
		if (numy == 1)
			y = "a dress";
		if (numy == 2)
			y = "scandals";

		
		System.out.println("Enter a temperature: ");
		temp = scan.nextDouble();
		
		if (temp <= 70)
			System.out.println("It's cool, dress warmly.\n" +
			"I suggest wearing " + x);
		else
			System.out.println("It's warm, stay cool.\n" + 
		    "I suggest wearing " + y);
		
		
	}

}
