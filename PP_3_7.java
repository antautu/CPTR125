package Homework;
/* Write a program that reads the lengths of the sides
 * of a triangle from the user. Computer the area of the 
 * triangle using Heron's formula. Print the area to 3
 * decimal points */
import java.util.Scanner;
import java.text.DecimalFormat;
public class PP_3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double a, b, c, s, area;
		
		System.out.println("Enter a length for the side of a triangle: ");
		a = scan.nextDouble();
		System.out.println("Enter a length for the side of a triangle: ");
		b = scan.nextDouble();
		System.out.println("Enter a length for the side of a triangle: ");
		c = scan.nextDouble();
		
		s = 0.5*(a+b+c);
		
		area = Math.sqrt(s*(s-a)*(s-b)*(s-c));
		
		DecimalFormat fmt = new DecimalFormat("0.###");
		
		System.out.println("Area of the triangle: " + fmt.format(area));
		
		
		
	}

}
