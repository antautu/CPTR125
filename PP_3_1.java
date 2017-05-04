package Homework;
/* Write a program that prompts for and reads the user's
 * first and last name. Then print a string composed of the 
 * first letter of the user's first name, followed by the first
 * five characters of the user's last name, followed by a random
 * number in the range 10 to 99 */
import java.util.Random;
import java.util.Scanner;
public class PP_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		
		String first_name, last_name, user_name;
		int num;
		
		num = generator.nextInt(90) + 10;
		
		System.out.println("Enter your first name: ");
		first_name = scan.nextLine();
		System.out.println("Enter your last name: ");
		last_name = scan.nextLine();
		
		user_name = first_name.charAt(0) + last_name.substring(0, 5) + num;
		
		System.out.println("Username: " + user_name);
	}

}
