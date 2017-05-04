package In_Class;
import java.util.Scanner;
public class Intersector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		final double y;
		final double x;
		double b;
		double c;
		double m;
		double n;
		
		System.out.println("Enter a number for b: ");
		b = scan.nextDouble();
		System.out.println("Enter a number for c: ");
		c = scan.nextDouble();
		System.out.println("Enter a number for m: ");
		m = scan.nextDouble();
		System.out.println("Enter a number for n: ");
		n = scan.nextDouble();
		
		x = (c - b) / (m - n);
		y = m * x + b;
		System.out.println("(" + x + "," + y + ")");
	
		
		
		
		
	}

}
