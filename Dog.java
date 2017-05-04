package Labs;

public class Dog 
{
	private String name, breed;
	private int age;
	
	public void Breed()
	{
		breed = "";
	}
	public void Name()
	{
		name = "";
	}
	public void Age()
	{
		age = 0;
	}
	// Sets and gets breed
	public void setBreed(String input_breed)
	{
		breed = input_breed;
	} 
	public String getBreed()
	{
		return breed;
	}
	// Sets and gets name
	public void setName(String input_name)
	{
		name = input_name;
	}
	public String getName()
	{
		return name;
	}
	// Sets and gets age and converts to String 
	public void setAge(int input_age)
	{
		age = input_age;
	}
	public int getAge()
	{
		return age;
	}
	public String toString()
	{
		String result = Integer.toString(age);
		return result;
	}
}
