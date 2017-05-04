package Homework;

public class Book 
{
	String Title, Author, Publisher;
	int Date, times_CO;
	boolean CO;
		
	public Book(String title, String author, String publisher, int date)
	{
		Title = title;
		Author = author;
		Publisher = publisher;
		Date = date;
		times_CO = 0;
		CO = false;
	}
	
	public String getTitleandAuthor()
	{
		String TitleandAuthor = Title + " by " + Author;
		return TitleandAuthor;
	}
	
	public int getTimesCO()
	{
		return times_CO;
	}
	
	public void Checkout()
	{
		if(CO == false)
		{
			CO = true;
			times_CO ++;
			System.out.println("Enjoy " + Title + ".");
		}
		else
		{
			System.out.println("The process could not be completed. " + 
					"\n\t" + Title + " is already checked out.");
		}
	}
	
	public void Return()
	{
		if(CO == true)
		{
			CO = false;
			System.out.println("We hope you enjoyed " + Title + ".");
		}
		else
		{
			System.out.println("How did you get " + Title + "?" + 
					"\n\t" + "It has not been checked out.");
		}
	}
	
	public String toString()
	{
		String info = Title + " by " + Author + " published by " + Publisher + 
				" in " + Date + "\n\thas been checked out " + times_CO + " times.";
		return info;
	}
	
	public void Rating(int rating)
	{
		int user_rating = rating;
		System.out.println("You rated " + Title + " a " + user_rating + " out of 10.");
	}

}
