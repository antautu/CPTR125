package Homework;
import java.text.NumberFormat;
public class Account{

	// Instance Data
	private final double RATE1 = 0.01, RATE3 = 0.03; //Interest Rate
	private long acctNumber;
	private double balance;
	private String name, type;
	
	// Account Constructor
	public Account(String owner, String account_type, long account, double initial)
	{
		name = owner;
		type = account_type;
		acctNumber = account;
		balance = initial;
	}
	
	// Deposits amount and returns the new balance
	public double deposit(double amount)
	{
		balance = balance + amount;
		return balance;
	}
	
	//Withdraws amount, charges the fee, and then returns the new balance
	public double withdraw(double amount, double fee)
	{
		if (balance - amount > 200)
		{
			balance = balance - amount;
			return balance;
		}
		else
		{
			balance = balance - amount - fee;
			return balance;
		}
	}
	
	// Adds interest to the account and returns the new balance
	public double addInterest()
	{
		if (type == "Savings")
		{
			if (balance <= 500.0)
			{
				balance = balance+balance*RATE1;
			}
			if (balance > 500.0)
			{
				balance = balance+balance*RATE3;
			}
		}
			return balance;
	}
	
	// Returns the current account balance
	public double getBalance()
	{
		return balance;
	}
	// Returns the account number
	public long getAcctNumber()
	{
		return acctNumber;
	}
	// Returns the name of the account owner
	public String getName()
	{
		return name;
	}
	// Required information print out
	public String toString()
	{
		NumberFormat fmt = NumberFormat.getCurrencyInstance();
		String toReturn = acctNumber + "\t" + type + "       " + name + "\t" +fmt.format(balance);
		return toReturn;
	}	
}
