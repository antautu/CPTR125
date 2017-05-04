package Homework;
/* Write a program that reads a floating point value
 * (double) and prints the closest whole numbers less
 * than and greater than that value */
import java.util.Scanner;
public class PP_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double num;
		
		System.out.println("Enter a decimal value: ");
		num = scan.nextDouble();
		
		System.out.println("Number rounded down: " + (int)Math.floor(num));
		System.out.println("Number rounded up: " + (int)Math.ceil(num));
		
	}

}
