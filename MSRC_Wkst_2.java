package Homework;
import java.util.Scanner;
public class MSRC_Wkst_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String first_name, last_name, user_name;
		int length;
		char num_char = (char) (1+48);
		
		System.out.println("Enter your first name: ");
		first_name = scan.nextLine();
		System.out.println("Enter your last name: ");
		last_name = scan.nextLine();
		
		length = first_name.length();
		user_name = first_name.substring(length - 5, length)+last_name.substring(1, 2)+last_name.substring(3, 4)+last_name.substring(4, 5);
		
		user_name = user_name.toUpperCase();
		user_name = user_name.replace('I', num_char);
		System.out.println(user_name);
		
		
	}

}
