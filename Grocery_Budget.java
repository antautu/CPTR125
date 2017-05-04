package In_Class;
import java.util.Scanner;
public class Grocery_Budget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double milk_price, bread_price, egg_price;
		double grocery_bill;
		double tax;
		
		System.out.println("Enter the price of 1 gallon of milk: ");
		milk_price = scan.nextDouble();
		System.out.println("Enter the price of 1 loaf of bread: ");
		bread_price = scan.nextDouble();
		System.out.println("Enter the price of 1 dozen eggs: ");
		egg_price = scan.nextDouble();
		
		tax = 0.06*(milk_price + 2*bread_price + 3*egg_price);
		grocery_bill = milk_price + 2*bread_price + 3*egg_price + tax;
		
		grocery_bill = (int)(100*grocery_bill);
		grocery_bill = grocery_bill/100;
		
		System.out.println("Grocery Bill: $" + grocery_bill);
	}

}
