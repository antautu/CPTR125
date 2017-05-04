package Homework;

public class Dominoes {
	public static void main(String[] args) {
		
		Pizza myPizza1 = new Pizza("Large", "Thin Crust"); 
		myPizza1.set_toppings("Mushrooms and Pepperoni");
		myPizza1.set_cheese("Mozzarella");
		myPizza1.cut_and_cook();
		myPizza1.sell();
		System.out.println();
		
		Pizza myPizza2 = new Pizza("Small", "Deep Dish Crust"); 
		myPizza2.set_toppings("Veggies");
		myPizza2.set_cheese("Fontina");
		myPizza2.sell();
		System.out.println();
		
		Pizza myPizza3 = new Pizza("Medium", "Regular Crust"); 
		myPizza3.set_toppings("No other toppings");
		myPizza3.set_cheese("Bleu");
		myPizza3.cut_and_cook();
		myPizza3.sell();
	}
}

