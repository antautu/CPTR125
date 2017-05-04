package In_Class;
import java.util.Scanner;
public class Averager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int int1, int2, int3;
		double average;
		
		System.out.println("Enter an integer: ");
		int1 = scan.nextInt();
		System.out.println("Enter an integer: ");
		int2 = scan.nextInt();
		System.out.println("Enter an integer: ");
		int3 = scan.nextInt();
		
		average = (int1 + int2 + int3) / 3.0;
		
		System.out.println("Average of integers:" + average);
		
	}

}
