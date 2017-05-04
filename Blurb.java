package In_Class;
import java.util.Scanner;
public class Blurb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		String name, college, pet_name;
		String age;
		
		System.out.println("Enter your name: ");
		name = scan.nextLine();
		System.out.println("Enter your age: ");
		age = scan.nextLine();
		System.out.println("Enter the name of your college: ");
		college = scan.nextLine();
		System.out.println("Enter your pet's name: ");
		pet_name = scan.nextLine();
		
		System.out.println("Hello, my name is " + name + " and I am " + age + " years");
		System.out.println("old. I'm enjoying my time at " + college + ", but");
		System.out.println("I miss my pet " + pet_name + " very much.");
	}

}
