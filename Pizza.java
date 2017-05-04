package Homework;

public class Pizza 
{
	private boolean rolled, cut_and_cooked;
	private String crust, size, toppings, cheese;
	
	// Pizza Constructor
	public Pizza(String Size, String Crust)
	{
		size = Size;
		crust = Crust;
		cheese = "";
		toppings = "";
		cut_and_cooked = false;
		roll();
	}
	private void roll()
	{
		rolled = true;
	}
	public void set_toppings(String topping_choice)
	{
		toppings = topping_choice;
	}
	public void set_cheese(String cheese_choice)
	{
		cheese = cheese_choice;
	}
	public void cut_and_cook()
	{
		cut_and_cooked = true;
	}
	public void sell()
	{
		if(cut_and_cooked && rolled == true)
		{
			System.out.println("Your " + size + ", " + crust + " pizza with " + 
					cheese + " cheese\n\t" + " and " + toppings + " is ready at the counter.");
		}
		if(rolled == false)
		{
			System.out.println("Roll the " + size + ", " + crust + ", " + 
					cheese + " cheese\n\t" + " and " + toppings + " pizza first.");
		}
		if(cut_and_cooked == false)
		{
			System.out.println("Cut and cook the " + size + ", " + crust + ", " + 
					cheese + " cheese,\n\t" + " and " + toppings + " pizza first.");
		}
	}
}
