package Homework;

public class BookCollection 
{
	private Book[] collection;
	private int count;

	public BookCollection()
	{
		collection = new Book[5];
		count = 0;
	}
	public void addBook(String title, String author, String publisher, int date)
	{
		if (count == collection.length)
		{
			increaseSize();
		}
		collection[count] = new Book(title, author, publisher, date);
		count ++;
	}
	private void increaseSize()
	{
		Book[] temp = new Book[collection.length + 50];
		for (int i = 0; i < collection.length; i ++)
		{
			temp[i] = collection[i];
		}
		collection = temp;
		System.out.println("increaseSzie has been called. " + 
				"Collections new length is " + collection + ".");
	}
	public void CheckOutBook(int placeInCollection)
	{
		collection[placeInCollection].Checkout();
	}
	public void ReturnBook(int placeInCollection)
	{
		collection[placeInCollection].Return();
	}
	public String toString()
	{
		return collection.toString();
	}
}
