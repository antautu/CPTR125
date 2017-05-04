package Homework;

public class Counter {
	private int count;
	// A constructor that initializes the count to 0
	public Counter()
	{
		count = 0;
	}
	// A method called click that increments the count
	public void click()
	{
		count ++;
	}
	// A method called getCount that returns the current count
	public int getCount()
	{
		return count;
	}
	// A method called reset that resets the count to 0
	public void reset()
	{
		count = 0;
	}
	// A method called toString that returns the count as a String
	public String toString()
	{
		String result = Integer.toString(count);
		return result;
	}
}
