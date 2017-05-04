package Homework;
/* Write a program that prompts for and reads a 
 * double value representing a monetary amount.
 * Then determine the fewest number of each bill
 * and coin needed to represent the amount, starting
 * with the highest (assume that a $10 bill is the 
 * maximum size needed). */

import java.util.Scanner;
public class PP_2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		double amount;
		double amount_as_pennies; 
		int ten = 1000, num_tens;
		int five = 500, num_fives;
		int one = 100, num_ones;
		int quarter = 25, num_quarters;
		int dime = 10, num_dimes;
		int nickel = 5, num_nickels;
		int penny = 1, num_pennies;
		
		System.out.println("Enter a monetary amount: ");
		amount = scan.nextDouble();
		
		amount_as_pennies = amount * 100;
		
		num_tens = (int)amount_as_pennies / ten;
		amount_as_pennies = amount_as_pennies - num_tens*ten;
		
		num_fives = (int)amount_as_pennies / five;
		amount_as_pennies = amount_as_pennies - num_fives*five;
		
		num_ones = (int)amount_as_pennies / one;
		amount_as_pennies = amount_as_pennies - num_ones*one;
		
		num_quarters = (int)amount_as_pennies / quarter;
		amount_as_pennies = amount_as_pennies - num_quarters*quarter;
		
		num_dimes = (int)amount_as_pennies / dime;
		amount_as_pennies = amount_as_pennies - num_dimes*dime;
		
		num_nickels = (int)amount_as_pennies / nickel;
		amount_as_pennies = amount_as_pennies - num_nickels*nickel;
		
		num_pennies = (int)amount_as_pennies / penny;
		amount_as_pennies = amount_as_pennies - num_pennies*penny;
		
		System.out.println(num_tens + " ten dollar bills");
		System.out.println(num_fives + " five dollar bills");
		System.out.println(num_ones + " one dollar bills");
		System.out.println(num_quarters + " quarters");
		System.out.println(num_dimes + " dimes");
		System.out.println(num_nickels + " nickels");
		System.out.println(num_pennies + " pennies");
		
		
	}

}
