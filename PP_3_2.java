package Homework;
/* Write a program that prints the sum of cubes. Prompt
 * for and read 2 integer values and print the sum of each
 * value raised to the third power */
import java.util.Scanner;
public class PP_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		double sum;
		
		System.out.println("Enter an integer value: ");
		num1 = scan.nextInt();
		System.out.println("Enter another integer value: ");
		num2 = scan.nextInt();
		
		sum = Math.pow(num1, 3) + Math.pow(num2, 3);
		
		System.out.println("Sum of the integers cubed: " + sum);
		
	}

}
