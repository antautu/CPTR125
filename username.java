package In_Class;
import java.util.Scanner;
public class username {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String first_name, last_name, username;
		int fav_num;
		String mut1, mut2, mut4, mut5, mut6;
		int mut3;
		char num_char;
	
		
		System.out.println("Enter your first name: ");
		first_name = scan.nextLine();
		System.out.println("Enter your last name: ");
		last_name = scan.nextLine();
		System.out.println("Enter your favorite number between 0 and 9: ");
		fav_num = scan.nextInt();
		
		num_char = (char)(fav_num+48);
		
		mut1 = first_name.toLowerCase();
		mut2 = last_name.toLowerCase();
		mut3 = mut1.length();
		mut4 = mut2.substring(0, 4);
		mut5 = mut1.substring(mut3 - 3, mut3);
		mut6 = mut4.replace('a', num_char);
		
	
		
		System.out.println(mut1);
		System.out.println(mut2);
		System.out.println(mut3);
		System.out.println(mut4);
		System.out.println(mut5);
		System.out.println("Username: " + mut6 + mut5);
		
		
	}

}
