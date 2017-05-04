package Labs;
import java.util.Scanner;
public class floatEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1, num2, TOLERANCE;
		
		System.out.println("Enter two floating point values: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		System.out.println("Enter a tolerance value: ");
		TOLERANCE = scan.nextDouble();
		
		if (Math.abs(num1 - num2) < TOLERANCE)
			System.out.println("True");
		else
			System.out.println("False");
	}

}
