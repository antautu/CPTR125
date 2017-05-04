package Homework;
import java.util.Scanner;
public class Ex_5_13 {

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
