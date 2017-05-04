package Homework;
/* Ex 5.13: Write a method called larger that accepts two floating point
 * parameters (of type double) and returns and prints "True" if the first
 * parameter is greater than the second, and prints "False" otherwise. */
import java.util.Scanner;
public class larger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double num1, num2;
		System.out.println("Enter two floating point values: ");
		num1 = scan.nextDouble();
		num2 = scan.nextDouble();
		
		if (num1 > num2)
			System.out.println("True.");
		else
			System.out.println("False.");
	}

}
