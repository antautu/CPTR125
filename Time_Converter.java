package In_Class;
import java.util.Scanner;
public class Time_Converter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		int hours, minutes, seconds;
		int total_seconds;
		
		System.out.println("Enter the number of hours: ");
		hours = scan.nextInt();
		System.out.println("Enter the number of minutes: ");
		minutes = scan.nextInt();
		System.out.println("Enter the number of seconds: ");
		seconds = scan.nextInt();
		
		total_seconds = 3600*hours + 60*minutes + seconds;
		
		System.out.println("Total number of seconds: " + total_seconds);
		
	}

}
