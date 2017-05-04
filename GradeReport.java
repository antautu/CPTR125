package In_Class;

import java.util.Scanner;
public class GradeReport {
	public static void main(String[] args){
		
		String grade;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter a letter grade (A - F), I for incomplete, or W for withdrew: ");
		grade = scan.nextLine();		
		
		System.out.print("The grade is ");
		switch (grade)
		{
			case "A":
				System.out.println("well above average. Nice.");
				break;
			case "B":
				System.out.println("above average. Alright.");
				break;
			case "C":
				System.out.println("average.");
				break;
			case "D":
				System.out.println("below average. Work harder.");
				break;
			case "F":
				System.out.println("failing.");
				break;
			case "I":
				System.out.println("incomplete.");
				break;
			case "W":
				System.out.println("not relevant because you withdrew.");
				break;
			default:
				System.out.println("not a valid response.");
		}
	}
}

