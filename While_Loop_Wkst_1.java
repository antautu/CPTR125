package Homework;
import java.util.Scanner;
public class While_Loop_Wkst_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String grade;
		char A = 'A', B = 'B', C = 'C', D = 'D', E = 'E', F = 'F';
		System.out.println("Enter your letter grade: ");
		grade = scan.nextLine();
		
		while (grade.charAt(0) != A && grade.charAt(0) != B && grade.charAt(0) 
				!= C && grade.charAt(0) != D && grade.charAt(0) 
				!= E && grade.charAt(0) != F)
		{
			System.out.println("You did not enter a valid letter grade." +
					" Please try again.");
			System.out.println("Enter your letter grade: ");
			grade = scan.nextLine();
		}
			
			if (grade.charAt(0) == A || grade.charAt(0) == B || grade.charAt(0) 
					== C || grade.charAt(0) == D || grade.charAt(0) 
					== E || grade.charAt(0) == F)
			{
				if (grade.charAt(0) == A)
					System.out.println(grade + ". Great job!");
				if (grade.charAt(0) == B)
					System.out.println(grade + ". Good job!"); 
				if (grade.charAt(0) == C)
					System.out.println(grade + ". Maybe you should study some more.");
				if (grade.charAt(0) == D)
					System.out.println(grade + ". You really need to study some more.");
				if (grade.charAt(0) == F)
					System.out.println(grade + ". Have you thought about getting a tutor?");
			}
		
	}

}
